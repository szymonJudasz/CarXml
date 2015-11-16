//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 04:25:20 PM CET 
//


package xml_classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml_classes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Data_QNAME = new QName("http://www.example.org/Schema", "Data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml_classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataListType }
     * 
     */
    public DataListType createDataListType() {
        return new DataListType();
    }

    /**
     * Create an instance of {@link OwnedVehicleType }
     * 
     */
    public OwnedVehicleType createOwnedVehicleType() {
        return new OwnedVehicleType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Schema", name = "Data")
    public JAXBElement<DataListType> createData(DataListType value) {
        return new JAXBElement<DataListType>(_Data_QNAME, DataListType.class, null, value);
    }

}