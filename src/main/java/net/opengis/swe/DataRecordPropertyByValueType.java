//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 12:05:10 PM CET 
//


package net.opengis.swe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataRecordPropertyByValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRecordPropertyByValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/swe/2.0}DataRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRecordPropertyByValueType", propOrder = {
    "dataRecord"
})
public class DataRecordPropertyByValueType {

    @XmlElement(name = "DataRecord", required = true)
    protected DataRecordType dataRecord;

    /**
     * Gets the value of the dataRecord property.
     * 
     * @return
     *     possible object is
     *     {@link DataRecordType }
     *     
     */
    public DataRecordType getDataRecord() {
        return dataRecord;
    }

    /**
     * Sets the value of the dataRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRecordType }
     *     
     */
    public void setDataRecord(DataRecordType value) {
        this.dataRecord = value;
    }

}
