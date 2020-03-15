package com.napier.sem;

/**
 * <h1>Language Class</h1>
 * Represents the Language class
 *
 * @author Daniela Todorova
 * @author Miguel Bacharov
 * @author Mihail Yonchev
 * @author Valeri Vladimirov
 */

public class Language {
    private String countryCode;
    private String languageName;
    private String isOfficial;
    private Double percentage;

    /**
     * Class Constructor:
     *
     * @param countryCode
     * @param languageName
     * @param isOfficial
     * @param percentage
     */
    public Language(String countryCode, String languageName, String isOfficial, double percentage) {
        this.countryCode = countryCode;
        this.languageName = languageName;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    /**
     * @return The language name
     */
    public String getCountryCode() {return countryCode; }

    /**
     * @return The language name
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * @return Whether its official
     */
    public String isOfficial() {
        return isOfficial;
    }

    /**
     * @return The percentage of people who speak it
     */
    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Language{" + "languageName='" + languageName + "', " + "percentage='" + percentage + "', " +  "isOfficial='" + isOfficial + "'" + "}";
    }
}