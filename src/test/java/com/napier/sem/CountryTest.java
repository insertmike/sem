package com.napier.sem;

import com.napier.sem.Country;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This Class Tests for the CountryTest Data Model to verify that the correct data is
 * stored in the structs correctly.
 */

class CountryTest {
    @Test
    void getISO3Code() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("COL", country.getISO3Code());
    }

    @Test
    void getName() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("Columbia", country.getName());
    }

    @Test
    void getContinent() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("South America", country.getContinent());
    }

    @Test
    void getRegion() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("South America", country.getRegion());
    }

    @Test
    void getSurfaceArea() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(10.00, country.getSurfaceArea());
    }

    @Test
    void getIndependenceYear() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(1966, country.getIndependenceYear());
    }

    @Test
    void getPopulation() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(100, country.getPopulation());
    }

    @Test
    void getLifeExpectancy() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(20.00, country.getLifeExpectancy());
    }

    @Test
    void getGNP() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(200.00, country.getGNP());
    }

    @Test
    void getGNPOld() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(300.00, country.getGNPOld());
    }

    @Test
    void getLocalName() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("Aruba", country.getLocalName());
    }

    @Test
    void getGovernmentForm() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("Islamic Emirate", country.getGovernmentForm());
    }

    @Test
    void getHeadOfState() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("Mohammad Omar", country.getHeadOfState());
    }

    @Test
    void getCapital() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals(1, country.getCapital());
    }

    @Test
    void getISO2Code() {
        // Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.00, 1966, 100,
                20.00, 200.00, 300.00,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        // Assert
        assertEquals("CO", country.getISO2Code());
    }

    @Test
    void toStringTest() {
        //Arrange
        Country country = new Country("COL", "Columbia",
                "South America", "South America",
                10.0, 1966, 100,
                20.0, 200.0, 300.0,
                "Aruba", "Islamic Emirate",
                "Mohammad Omar", 1, "CO");

        //Assert
        assertEquals("Country{" +
                "ISO3Code='COL"  + '\'' +
                ", name='Columbia" + '\'' +
                ", continent='South America" + '\'' +
                ", region='South America" + '\'' +
                ", surfaceArea=10.0" +
                ", independenceYear=1966" +
                ", population=100" +
                ", lifeExpectancy=20.0" +
                ", GNP=200.0" +
                ", GNPOld=300.0" +
                ", localName='Aruba" + '\'' +
                ", governmentForm='Islamic Emirate" + '\'' +
                ", headOfState='Mohammad Omar" + '\'' +
                ", capital=1"  +
                ", ISO2Code='CO" + '\'' +
                '}', country.toString());

    }
}