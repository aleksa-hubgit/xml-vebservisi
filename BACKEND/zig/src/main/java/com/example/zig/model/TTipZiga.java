
package com.example.zig.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTip_ziga.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TTip_ziga">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INDIVIDUALNI_ZIG"/>
 *     <enumeration value="KOLEKTIVNI_ZIG"/>
 *     <enumeration value="GARANTNI_ZIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TTip_ziga", namespace = "http://www.ftn.uns.ac.rs/zig")
@XmlEnum
public enum TTipZiga {

    INDIVIDUALNI_ZIG,
    KOLEKTIVNI_ZIG,
    GARANTNI_ZIG;

    public String value() {
        return name();
    }

    public static TTipZiga fromValue(String v) {
        return valueOf(v);
    }

}
