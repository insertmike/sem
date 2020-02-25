package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CityReportTest
{
    static App app;
    static City city;

    @BeforeAll
    static void init()
    {
        app = new App();
        city = new City(1, "Sofia", "BG", "BG", 1300000);
    }

    @Test
    void displayCityTest()
    {
        app.displayCity(city);
    }

    @Test
    void displayCityTestNull()
    {
        app.displayCity(null);
    }
}