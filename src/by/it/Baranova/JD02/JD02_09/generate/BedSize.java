//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.30 at 12:15:44 PM MSK 
//


package by.it.Baranova.JD02.JD02_09.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bed_size complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bed_size">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first_Bed_size" type="{http://generate.JD02_09.JD02.Baranova.it.by/}First_Bed_size"/>
 *         &lt;element name="second_Bed_size" type="{http://generate.JD02_09.JD02.Baranova.it.by/}Second_Bed_size"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bed_size", propOrder = {
    "firstBedSize",
    "secondBedSize"
})
public class BedSize {

    @XmlElement(name = "first_Bed_size", required = true)
    @XmlSchemaType(name = "string")
    protected FirstBedSize firstBedSize;
    @XmlElement(name = "second_Bed_size", required = true)
    @XmlSchemaType(name = "string")
    protected SecondBedSize secondBedSize;

    /**
     * Gets the value of the firstBedSize property.
     * 
     * @return
     *     possible object is
     *     {@link FirstBedSize }
     *     
     */
    public FirstBedSize getFirstBedSize() {
        return firstBedSize;
    }

    /**
     * Sets the value of the firstBedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstBedSize }
     *     
     */
    public void setFirstBedSize(FirstBedSize value) {
        this.firstBedSize = value;
    }

    /**
     * Gets the value of the secondBedSize property.
     * 
     * @return
     *     possible object is
     *     {@link SecondBedSize }
     *     
     */
    public SecondBedSize getSecondBedSize() {
        return secondBedSize;
    }

    /**
     * Sets the value of the secondBedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondBedSize }
     *     
     */
    public void setSecondBedSize(SecondBedSize value) {
        this.secondBedSize = value;
    }

    public String toString() {
        return "\nFirst bed size :" + firstBedSize
                + "\n\tSecond bed size: " + secondBedSize + "\n";
    }

}