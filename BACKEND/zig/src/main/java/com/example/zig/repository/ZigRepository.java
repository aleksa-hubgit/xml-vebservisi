package com.example.zig.repository;

import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.Prijava;
import com.example.zig.util.DatabaseUtilities;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.XMLDBException;

import java.io.OutputStream;
import java.util.List;

@Repository
public class ZigRepository {

    private final String collectionId = "db/zigovi";



    public void save(OutputStream os, String id) throws XMLDBException {
        DatabaseUtilities.storeResource(collectionId, id, os);

    }

    public List<Prijava> getAll() {

        return DatabaseUtilities.getAll(collectionId);
    }
}
