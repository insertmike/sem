package com.napier.sem;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This Class Tests for the City Data Model to verify that the correct data is
 * stored in the structs correctly.
 */

class CityTest {
    @Test
    void getId() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals(1, city.getId());
    }

    @Test
    void getName() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals("Varna", city.getName());
    }

    @Test
    void getPopulation() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals(100000, city.getPopulation());
    }

    @Test
    void getCountry_code() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals("169", city.getCountry_code());
    }

    @Test
    void getDistrict() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals("Varna", city.getDistrict());
    }

    @Test
    void toStringTest() {
        //Arrange
        City city = new City(1,"Varna", "169", "Varna", 100000);

        //Assert
        assertEquals("City{" +
                "id=1" +
                ", name='Varna" + '\'' +
                ", country_code='169" + '\'' +
                ", district='Varna" + '\'' +
                ", population=100000" +
                '}', city.toString());
    }
}