
package com.example.zig.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTip_znaka.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TTip_znaka">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VERBALNI_ZNAK"/>
 *     <enumeration value="GRAFICKI_ZNAK"/>
 *     <enumeration value="KOMBINOVANI_ZNAK"/>
 *     <enumeration value="TRODIMENZIONALNI_ZNAK"/>
 *     <enumeration value="DRUGA_VRSTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TTip_znaka", namespace = "http://www.ftn.uns.ac.rs/zig")
@XmlEnum
public enum TTipZnaka {

    VERBALNI,
    GRAFICKI,
    KOMBINOVANI,
    TRODIMENZIONALNI,
    DRUGA_VRSTA;

    public String value() {
        return name();
    }

    public static TTipZnaka fromValue(String v) {
        return valueOf(v);
    }

}
