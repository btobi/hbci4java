
package org.kapott.hbci.sepa.jaxb.pain_008_002_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CstmrDrctDbtInitn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}CustomerDirectDebitInitiationV02"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.002.02", propOrder = {
    "cstmrDrctDbtInitn"
})
public class Document {

    @XmlElement(name = "CstmrDrctDbtInitn", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.002.02", required = true)
    protected CustomerDirectDebitInitiationV02 cstmrDrctDbtInitn;

    /**
     * Ruft den Wert der cstmrDrctDbtInitn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV02 }
     *     
     */
    public CustomerDirectDebitInitiationV02 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Legt den Wert der cstmrDrctDbtInitn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV02 }
     *     
     */
    public void setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV02 value) {
        this.cstmrDrctDbtInitn = value;
    }

}
