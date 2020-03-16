package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class handles the App Integration Tests, meaning that it verifies that the application
 * works correctly when tested against the database, making sure that everything works correctly.
 */

public class AppIntegrationTest {
    static App app;

    /**
     * Intialize the Main Test Class
     */
    @BeforeAll
    static void init() {

        app = new App();
        app.connect("192.168.99.100:33060");
    }

    /**
     * Test to verify that the data returned for a city,
     * is valid from the database;
     */
    @Test
    void testGetCity() {

        City city = app.getCity(1);
        assertEquals(city.getId(), 1);
        assertEquals(city.getName(), "Kabul");
        assertEquals(city.getCountry_code(), "AFG");
        assertEquals(city.getDistrict(), "Kabol");
        assertEquals(city.getPopulation(), 1780000);
    }

    /**
     * Verify for the Country Language data to be returned
     * correctly.
     */
    @Test
    void testGetCountryLanguage() {

        Language language = app.getCountryLanguage("ABW", "Dutch");
        assertEquals(language.getCountryCode(), "ABW");
        assertEquals(language.getLanguageName(), "Dutch");
        assertEquals(language.isOfficial(), "T");
        assertEquals(language.getPercentage(), 5.3);
    }

    /**
     * Verify for the Country data to be returned
     * correctly.
     */
    @Test
    void testGetCountry() {

        Country country = app.getCountry("ABW");
        assertEquals(country.getISO3Code(), "ABW");
        assertEquals(country.getName(), "Aruba");
        assertEquals(country.getContinent(), "North America");
        assertEquals(country.getRegion(), "Caribbean");
        assertEquals(country.getSurfaceArea(), 193.00);
        assertEquals(country.getIndependenceYear(), 0);
        assertEquals(country.getPopulation(), 103000);
        assertEquals(country.getLifeExpectancy(), 78.4);
        assertEquals(country.getGNP(), 828.00);
        assertEquals(country.getGNPOld(), 793.00);
        assertEquals(country.getLocalName(), "Aruba");
        assertEquals(country.getGovernmentForm(), "Nonmetropolitan Territory of The Netherlands");
        assertEquals(country.getHeadOfState(), "Beatrix");
        assertEquals(country.getCapital(), 129);
        assertEquals(country.getISO2Code(), "AW");
    }

}