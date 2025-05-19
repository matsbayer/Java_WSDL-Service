
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
 *         <element name="FullCountryInfoAllCountriesResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryInfo"/>
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
    "fullCountryInfoAllCountriesResult"
})
@XmlRootElement(name = "FullCountryInfoAllCountriesResponse")
public class FullCountryInfoAllCountriesResponse {

    @XmlElement(name = "FullCountryInfoAllCountriesResult", required = true)
    protected ArrayOftCountryInfo fullCountryInfoAllCountriesResult;

    /**
     * Ruft den Wert der fullCountryInfoAllCountriesResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public ArrayOftCountryInfo getFullCountryInfoAllCountriesResult() {
        return fullCountryInfoAllCountriesResult;
    }

    /**
     * Legt den Wert der fullCountryInfoAllCountriesResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public void setFullCountryInfoAllCountriesResult(ArrayOftCountryInfo value) {
        this.fullCountryInfoAllCountriesResult = value;
    }

}
