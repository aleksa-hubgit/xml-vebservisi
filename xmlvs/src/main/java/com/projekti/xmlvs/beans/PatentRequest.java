package com.projekti.xmlvs.beans;

import java.util.List;

public class PatentRequest {
    private PatentName patentName;
    private Person applicant;
    private Person inventor;
    private Person proxy;
    private Address deliveryAddress;
    private DeliveryType deliveryType;
    private ApplicationType applicationType;
    private ApplicationDetailsPatent originalApplication;
    private List<ApplicationDetailsLabeled> previousApplications;
    private boolean hasAdditionalData;

}
