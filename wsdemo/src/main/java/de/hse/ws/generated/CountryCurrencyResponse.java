
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
 *         <element name="CountryCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCurrency"/>
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
    "countryCurrencyResult"
})
@XmlRootElement(name = "CountryCurrencyResponse")
public class CountryCurrencyResponse {

    @XmlElement(name = "CountryCurrencyResult", required = true)
    protected TCurrency countryCurrencyResult;

    /**
     * Ruft den Wert der countryCurrencyResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TCurrency }
     *     
     */
    public TCurrency getCountryCurrencyResult() {
        return countryCurrencyResult;
    }

    /**
     * Legt den Wert der countryCurrencyResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TCurrency }
     *     
     */
    public void setCountryCurrencyResult(TCurrency value) {
        this.countryCurrencyResult = value;
    }

}
