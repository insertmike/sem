package com.napier.sem;

import com.napier.sem.City;
import com.napier.sem.Language;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This Class Tests for the Language Data Model to verify that the correct data is
 * stored in the structs correctly.
 */

class LanguageTest {

    @Test
    void getCountryCode() {
        // Arrange
        Language language = new Language("COL", "English", "F", 25);

        // Assert
        assertEquals("COL", language.getCountryCode());
    }

    @Test
    void getLanguageName() {
        // Arrange
        Language language = new Language("COL", "English", "F", 25);

        // Assert
        assertEquals("English", language.getLanguageName());
    }

    @Test
    void isOfficial() {
        // Arrange
        Language language = new Language("COL", "English", "F", 25);

        // Assert
        assertEquals("F", language.isOfficial());
    }

    @Test
    void getPercentage() {
        // Arrange
        Language language = new Language("COL", "English", "F", 25);

        // Assert
        assertEquals(25, language.getPercentage());
    }

    @Test
    void toStringTest() {
        //Arrange
        Language language = new Language("COL", "English", "F", 25);

        //Assert
        assertEquals("Language{" + "languageName='English" + "', " + "percentage='25.0" + "', " +  "isOfficial='F" + "'" + "}", language.toString());
    }
}