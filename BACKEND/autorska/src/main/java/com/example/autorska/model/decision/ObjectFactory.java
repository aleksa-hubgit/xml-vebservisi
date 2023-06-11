package com.example.autorska.model.decision;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {



    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Decision }
     */
    public Decision createDecision() {
        return new Decision();
    }
}
