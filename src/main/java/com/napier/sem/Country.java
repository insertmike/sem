package com.napier.sem;

/**
 * <h1>Country Class</h1>
 * Represents the Country class
 *
 * @author Daniela Todorova
 * @author Miguel Bacharov
 * @author Mihail Yonchev
 * @author Valeri Vladimirov
 */
public class Country {
    private final String ISO3Code;
    private final String name;
    private final String continent;
    private final String region;
    private final Double surfaceArea;
    private final int independenceYear;
    private final int population;
    private final double lifeExpectancy;
    private final double GNP;
    private final double GNPOld;
    private final String localName;
    private final String governmentForm;
    private final String headOfState;
    private final String capital;
    private final String ISO2Code;

    public Country(String ISO3Code, String name, String continent, String region, Double surfaceArea, int indepYear, int population, double lifeExpectancy, double GNP, double GNPOld, String localName, String governmentForm, String headOfState, String capital, String ISO2Code) {
        this.ISO3Code = ISO3Code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.independenceYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.ISO2Code = ISO2Code;
    }

    /**
     * @return Country attributes required in the report
     */
    public String getCountryReport() {
        return String.format("%s %s %s %s %s %s %n", ISO2Code , name , continent, region, population, capital);
    }

    /**
     * @return The ISO 3166-1 alpha-3 country code
     */
    public String getISO3Code() {
        return ISO3Code;
    }

    /**
     * @return The name of the country
     */
    public String getName() {
        return name;
    }
    /**
     * @return The continent of the country
     */
    public String getContinent() {
        return continent;
    }
    /**
     * @return The geographic region of the country
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return The surface area of the country
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * @return The independence year
     */
    public int getIndependenceYear() {
        return independenceYear;
    }

    /**
     * @return The population of the country
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @return The life expectancy of the country
     */
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     *  @return The GNP (Gross National Product) of the country
     */
    public double getGNP() {
        return GNP;
    }
    /**
     *  @return The old GNP (Gross National Product) of the country
     */

    public double getGNPOld() {
        return GNPOld;
    }

    /**
     *  @return The local name of the country
     */
    public String getLocalName() {
        return localName;
    }

    /**
     *  @return The government form of the country
     */
    public String getGovernmentForm() {
        return governmentForm;
    }

    /**
     *  @return The head of state of the country
     */
    public String getHeadOfState() {
        return headOfState;
    }

    /**
     *  @return The capital of the country
     */
    public String getCapital() {
        return capital;
    }
    /**
     *  @return The ISO2Code of the country
     */
    public String getISO2Code() {
        return ISO2Code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "ISO3Code='" + ISO3Code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", independenceYear=" + independenceYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", ISO2Code='" + ISO2Code + '\'' +
                '}';
    }
}