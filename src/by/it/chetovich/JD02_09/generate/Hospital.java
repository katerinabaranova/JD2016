//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.28 at 11:04:39 PM EET 
//


package by.it.chetovich.JD02_09.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnoses" type="{http://generate.JD02_09.chetovich.it.by/}Diagnoses"/>
 *         &lt;element name="prescribings" type="{http://generate.JD02_09.chetovich.it.by/}Prescribings"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "diagnoses",
    "prescribings"
})
@XmlRootElement(name = "hospital")
public class Hospital {

    @XmlElement(required = true)
    protected Diagnoses diagnoses;
    @XmlElement(required = true)
    protected Prescribings prescribings;

    /**
     * Gets the value of the diagnoses property.
     * 
     * @return
     *     possible object is
     *     {@link Diagnoses }
     *     
     */
    public Diagnoses getDiagnoses() {
        return diagnoses;
    }

    /**
     * Sets the value of the diagnoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnoses }
     *     
     */
    public void setDiagnoses(Diagnoses value) {
        this.diagnoses = value;
    }

    /**
     * Gets the value of the prescribings property.
     * 
     * @return
     *     possible object is
     *     {@link Prescribings }
     *     
     */
    public Prescribings getPrescribings() {
        return prescribings;
    }

    /**
     * Sets the value of the prescribings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescribings }
     *     
     */
    public void setPrescribings(Prescribings value) {
        this.prescribings = value;
    }

}
