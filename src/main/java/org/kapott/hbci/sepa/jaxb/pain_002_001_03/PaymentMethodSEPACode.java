
package org.kapott.hbci.sepa.jaxb.pain_002_001_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentMethodSEPACode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodSEPACode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="DD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodSEPACode", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.002.001.03")
@XmlEnum
public enum PaymentMethodSEPACode {

    TRF,
    DD;

    public String value() {
        return name();
    }

    public static PaymentMethodSEPACode fromValue(String v) {
        return valueOf(v);
    }

}
