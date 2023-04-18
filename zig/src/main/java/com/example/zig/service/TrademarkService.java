package com.example.zig.service;

import com.example.zig.model.Prijava;
import com.example.zig.util.PdfTransformer;
import com.itextpdf.text.DocumentException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

@Service
public class TrademarkService {


    public static final String INPUT_FILE = "./src/main/resources/data/z1.xml";

    public static final String XSL_FILE = "./src/main/resources/data/z1.xsl";

    public static final String OUTPUT_FILE = "gen/bookstore.pdf";

    public static final String HTML_OUTPUT_FILE = "gen/bookstore.html";

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

    public void createRequest(Prijava request) {



    }
}
