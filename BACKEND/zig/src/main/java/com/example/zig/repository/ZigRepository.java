package com.example.zig.repository;

import com.example.zig.util.DatabaseUtilities;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.XMLDBException;

import java.io.OutputStream;

@Repository
public class ZigRepository {

    private final String collectionId = "db/zigovi";



    public void save(OutputStream os, String id) throws XMLDBException {
        DatabaseUtilities.storeResource("db/zigovi", id, os);

    }
}
