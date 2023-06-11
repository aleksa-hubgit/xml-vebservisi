package com.example.patent.repository;

import com.example.patent.model.Prijava;
import com.example.patent.model.decision.Decision;
import com.example.patent.util.AuthenticationUtilities;
import com.example.patent.util.DatabaseUtilities;
import org.exist.xmldb.EXistResource;
import org.springframework.stereotype.Repository;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.XMLResource;
import org.xmldb.api.modules.XPathQueryService;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PatentRepository {
    private final String collectionId = "db/patent";
    private final String collectionIdDecision = "db/pResenja";


    private Collection col;


    public PatentRepository() throws XMLDBException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DatabaseUtilities.init();
    }

    public void save(OutputStream os, String id) throws XMLDBException {
        DatabaseUtilities.storeResource(collectionId, id, os);

    }

    public List<Prijava> getAll() {

        return DatabaseUtilities.getAll(collectionId);
    }

    public List<XMLResource> getResources(String data) throws Exception{
        AuthenticationUtilities.ConnectionProperties conn = AuthenticationUtilities.loadProperties();
        String xpathExp = String.format("/*[contains(., '%s')]", data.toLowerCase());
        List<XMLResource> resources = new ArrayList<>();

        try {
            col = DatabaseManager.getCollection(conn.uri + collectionId);
            XPathQueryService xpathService = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            xpathService.setProperty("indent", "yes");

            ResourceSet result = xpathService.query(xpathExp);

            ResourceIterator i = result.getIterator();
            Resource res = null;

            while(i.hasMoreResources()) {

                try {
                    res = i.nextResource();
                    resources.add((XMLResource) res);
                }
                finally {

                    try {
                        if(res != null) {
                            ((EXistResource) res).freeResources();
                        }
                    } catch (XMLDBException xe) {
                        xe.printStackTrace();
                    }
                }
            }

        } finally {

            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }

        return resources;
    }


    public void saveDecision(OutputStream os, String sifraZahteva) throws XMLDBException {
        String documentId = "resenje-" + sifraZahteva;
        DatabaseUtilities.storeResource(collectionIdDecision, documentId, os);
    }

    public Prijava getOneById(String id) {
        return DatabaseUtilities.getOneById(collectionId, id);

    }

    public List<Decision> getAllDecisions() {
        return DatabaseUtilities.getAllDecisions(collectionIdDecision);

    }
}
