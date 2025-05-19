package de.hse.ws;

import de.hse.ws.generated.*;

public class Main {
    public static void main(String[] args) {

        CountryInfoService service = new CountryInfoService();

        CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();


        // Print all continents
        ArrayOftContinent continents = port.listOfContinentsByName();
        continents.getTContinent().stream()
                .map(TContinent::getSName)
                .forEach(System.out::println);

        System.out.println("\n---\n");

        // Print the capital of germany
        String germany = port.capitalCity("DEU");
        System.out.println(germany);

        System.out.println("\n---\n");

        // Print all countries that use currency €
        ArrayOftCountryCodeAndName test = port.countriesUsingCurrency("EUR");
        test.getTCountryCodeAndName().stream()
                .map(TCountryCodeAndName::getSName)
                .forEach(System.out::println);

    }
}
