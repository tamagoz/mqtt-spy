//
// Copyright (c) 2014 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.versions.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_LATEST"/>
 *     &lt;enumeration value="NEW_AVAILABLE"/>
 *     &lt;enumeration value="UPDATE_RECOMMENDED"/>
 *     &lt;enumeration value="CRITICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
*/
@SuppressWarnings("all")
@XmlType(name = "UpdateStatus")
@XmlEnum
public enum UpdateStatus {

    ON_LATEST,
    NEW_AVAILABLE,
    UPDATE_RECOMMENDED,
    CRITICAL;

    public String value() {
        return name();
    }

    public static UpdateStatus fromValue(String v) {
        return valueOf(v);
    }

}
