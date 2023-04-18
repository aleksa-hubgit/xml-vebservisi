package com.example.zig.service;

import com.example.zig.dto.TLiceDTO;
import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.*;
import com.example.zig.repository.ZigRepository;
import com.example.zig.util.MarshallingUtils;
import com.example.zig.util.PdfTransformer;
import com.itextpdf.text.DocumentException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class TrademarkService {


    public static final String INPUT_FILE = "./src/main/resources/data/z1.xml";

    public static final String XSL_FILE = "./src/main/resources/data/z1.xsl";

    public static final String OUTPUT_FILE = "gen/bookstore.pdf";

    public static final String HTML_OUTPUT_FILE = "gen/bookstore.html";

    @Autowired
    private ZigRepository zigRepository;

    public void createPdfDocument() throws DocumentException, IOException {

        System.out.println("[INFO] " + PdfTransformer.class.getSimpleName());

        // Creates parent directory if necessary
        File pdfFile = new File(OUTPUT_FILE);

        if (!pdfFile.getParentFile().exists()) {
            System.out.println("[INFO] A new directory is created: " + pdfFile.getParentFile().getAbsolutePath() + ".");
            pdfFile.getParentFile().mkdir();
        }

        PdfTransformer pdfTransformer = new PdfTransformer();

        pdfTransformer.generateHTML(INPUT_FILE, XSL_FILE);
        pdfTransformer.generatePDF(OUTPUT_FILE);

        System.out.println("[INFO] File \"" + OUTPUT_FILE + "\" generated successfully.");
        System.out.println("[INFO] End.");

    }



    public String createHtmlDocument() throws IOException, DocumentException {

        System.out.println("[INFO] " + PdfTransformer.class.getSimpleName());

        // Creates parent directory if necessary
        File pdfFile = new File(OUTPUT_FILE);

        if (!pdfFile.getParentFile().exists()) {
            System.out.println("[INFO] A new directory is created: " + pdfFile.getParentFile().getAbsolutePath() + ".");
            pdfFile.getParentFile().mkdir();
        }

        PdfTransformer pdfTransformer = new PdfTransformer();

        pdfTransformer.generateHTML(INPUT_FILE, XSL_FILE);

        System.out.println("[INFO] File \"" + HTML_OUTPUT_FILE + "\" generated successfully.");
        System.out.println("[INFO] End.");
        return "eto";
    }

    public void createRequest(TrademarkRequestDTO request) throws JAXBException, XMLDBException {
        Prijava prijava = this.createRequestFromDTO(request);

        this.save(prijava);

    }

    private void save(Prijava prijava) throws JAXBException, XMLDBException {
        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(prijava);
        zigRepository.save(os, "1");
    }

    private Prijava createRequestFromDTO(TrademarkRequestDTO request) {
        Prijava prijava = new Prijava();
        Prijava.InformacijaZavoda informacijaZavoda = new Prijava.InformacijaZavoda();
        informacijaZavoda.setBrojPrijave("1");
        Date date = new Date();
        XMLGregorianCalendar gregorianDate = createGregorianDate(date);
        informacijaZavoda.setDatumPodnosenja(gregorianDate);
        informacijaZavoda.setPrilozi(request.getPrilozi());

        prijava.setInformacijaZavoda(informacijaZavoda);
        prijava.setPravoPrvenstva(request.getPravoPrvenstva());
        prijava.setTakse(request.getTakse());

        prijava.setPunomocnik(createTLice(request.getPunomocnik()));
        prijava.setPodnosilacPrijave(createTLice(request.getPodnosilacPrijave()));
        prijava.setZajednickiPredstavnik(createTLice(request.getZajednickiPredstavnik()));

        return prijava;

    }

    private TLice createTLice(TLiceDTO zajednickiPredstavnik) {
        TAdresa adresa = zajednickiPredstavnik.getAdresa();
        TKontaktInformacije kontaktInformacije = zajednickiPredstavnik.getKontakt();
        if (zajednickiPredstavnik.getNaziv().equals("")){
            TPravnoLice lice = new TPravnoLice();
            lice.setNaziv(zajednickiPredstavnik.getNaziv());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;
        }
        else{
            TFizickoLice lice = new TFizickoLice();
            lice.setIme(zajednickiPredstavnik.getIme());
            lice.setPrezime(zajednickiPredstavnik.getPrezime());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;
        }
    }

    private XMLGregorianCalendar createGregorianDate(Date date) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);

        try {
            xmlDate = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return xmlDate;

    }

    public List<TrademarkRequestDTO> getAll() {
        List<Prijava> prijavas = zigRepository.getAll();
        List<TrademarkRequestDTO> trademarks = new ArrayList<>();
        for (Prijava p:prijavas){
            trademarks.add(new TrademarkRequestDTO(p));
        }
        return trademarks;

    }
}
