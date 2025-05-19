
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
 *         <element name="ListOfLanguagesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/>
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
    "listOfLanguagesByNameResult"
})
@XmlRootElement(name = "ListOfLanguagesByNameResponse")
public class ListOfLanguagesByNameResponse {

    @XmlElement(name = "ListOfLanguagesByNameResult", required = true)
    protected ArrayOftLanguage listOfLanguagesByNameResult;

    /**
     * Ruft den Wert der listOfLanguagesByNameResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getListOfLanguagesByNameResult() {
        return listOfLanguagesByNameResult;
    }

    /**
     * Legt den Wert der listOfLanguagesByNameResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setListOfLanguagesByNameResult(ArrayOftLanguage value) {
        this.listOfLanguagesByNameResult = value;
    }

}
