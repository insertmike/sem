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
        app.connect("localhost:33060");
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

}