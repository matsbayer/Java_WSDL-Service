
package de.hse.ws.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ListOfCountryNamesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCountryNamesByCodeResult"
})
@XmlRootElement(name = "ListOfCountryNamesByCodeResponse")
public class ListOfCountryNamesByCodeResponse {

    @XmlElement(name = "ListOfCountryNamesByCodeResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByCodeResult;

    /**
     * Ruft den Wert der listOfCountryNamesByCodeResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByCodeResult() {
        return listOfCountryNamesByCodeResult;
    }

    /**
     * Legt den Wert der listOfCountryNamesByCodeResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByCodeResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByCodeResult = value;
    }

}
