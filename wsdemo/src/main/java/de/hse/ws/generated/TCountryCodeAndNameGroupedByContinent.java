
package de.hse.ws.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tCountryCodeAndNameGroupedByContinent complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tCountryCodeAndNameGroupedByContinent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Continent" type="{http://www.oorsprong.org/websamples.countryinfo}tContinent"/>
 *         <element name="CountryCodeAndNames" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryCodeAndNameGroupedByContinent", propOrder = {
    "continent",
    "countryCodeAndNames"
})
public class TCountryCodeAndNameGroupedByContinent {

    @XmlElement(name = "Continent", required = true)
    protected TContinent continent;
    @XmlElement(name = "CountryCodeAndNames", required = true)
    protected ArrayOftCountryCodeAndName countryCodeAndNames;

    /**
     * Ruft den Wert der continent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TContinent }
     *     
     */
    public TContinent getContinent() {
        return continent;
    }

    /**
     * Legt den Wert der continent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TContinent }
     *     
     */
    public void setContinent(TContinent value) {
        this.continent = value;
    }

    /**
     * Ruft den Wert der countryCodeAndNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getCountryCodeAndNames() {
        return countryCodeAndNames;
    }

    /**
     * Legt den Wert der countryCodeAndNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setCountryCodeAndNames(ArrayOftCountryCodeAndName value) {
        this.countryCodeAndNames = value;
    }

}
