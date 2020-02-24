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
    private String languageName;
    private boolean isOfficial;
    private float percentage;

    public Language(String languageName, boolean isOfficial, float percentage) {
        this.languageName = languageName;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    /**
     * @return The language name
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * @return Whether its official
     */
    public boolean isOfficial() {
        return isOfficial;
    }

    /**
     * @return The percentage of people who speak it
     */
    public float getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Language{" + "languageName='" + languageName + "', " + "percentage='" + percentage + "', " +  "isOfficial='" + isOfficial + "'" + "}";
    }
}
