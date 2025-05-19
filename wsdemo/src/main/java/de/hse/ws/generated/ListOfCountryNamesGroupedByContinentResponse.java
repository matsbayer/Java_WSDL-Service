
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
 *         <element name="ListOfCountryNamesGroupedByContinentResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndNameGroupedByContinent"/>
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
    "listOfCountryNamesGroupedByContinentResult"
})
@XmlRootElement(name = "ListOfCountryNamesGroupedByContinentResponse")
public class ListOfCountryNamesGroupedByContinentResponse {

    @XmlElement(name = "ListOfCountryNamesGroupedByContinentResult", required = true)
    protected ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinentResult;

    /**
     * Ruft den Wert der listOfCountryNamesGroupedByContinentResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndNameGroupedByContinent }
     *     
     */
    public ArrayOftCountryCodeAndNameGroupedByContinent getListOfCountryNamesGroupedByContinentResult() {
        return listOfCountryNamesGroupedByContinentResult;
    }

    /**
     * Legt den Wert der listOfCountryNamesGroupedByContinentResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndNameGroupedByContinent }
     *     
     */
    public void setListOfCountryNamesGroupedByContinentResult(ArrayOftCountryCodeAndNameGroupedByContinent value) {
        this.listOfCountryNamesGroupedByContinentResult = value;
    }

}
