//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 04:25:20 PM CET 
//


package xml_classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnedVehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnedVehicleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/Schema}VehicleType">
 *       &lt;sequence>
 *         &lt;element name="FurtherInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnedVehicleType", propOrder = {
    "furtherInformation"
})
public class OwnedVehicleType
    extends VehicleType
{

    @XmlElement(name = "FurtherInformation", required = true)
    protected String furtherInformation;

    /**
     * Gets the value of the furtherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherInformation() {
        return furtherInformation;
    }

    /**
     * Sets the value of the furtherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherInformation(String value) {
        this.furtherInformation = value;
    }

}
