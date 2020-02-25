package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Class App</h1>
 * The App class is used to ensure and demonstrate implemented functionalities.
 *
 * @author Daniela Todorova
 * @author Miguel Bacharov
 * @author Mihail Yonchev
 * @author Valeri Vladimirov
 * @version 0.1.0.4
 * @since   2020-08-02
 */
public class App
{
    /**
     * This is the main method
     * @param args Unused.
     * @return Nothing
     */
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Get Target City Record
        City city = a.getCity(1);

        // Display target result
        a.displayCity(city);

        // Get all cities
        List<City> allCities = a.getAllCities();

        System.out.println("Total cities: " + allCities.size());

        System.out.println("First city in the list: " + allCities.get(0).toString());

        // Get all countries
        List<Country> allCountries = a.getAllCountries();

        System.out.println("Total countries: " + allCountries.size());

        Country firstCountryInList = allCountries.get(0);

        System.out.println("First country in the list: " + firstCountryInList.toString());

        System.out.println("City by largest population for: " + firstCountryInList.getName());

        List<City> cityReport = a.getCitiesByLargestPopulationInCountry(firstCountryInList);

        // The population of city Varna
        System.out.println("The population of city: " + allCities.get(540).getName() + " is " + allCities.get(540).getPopulation());

        // The population of district Varna
        int citiesNumber = 0;
        int totalPopulation = 0;
        for(City city1: allCities){
            if(city1.getDistrict().equals("Varna")){
                totalPopulation += city1.getPopulation();
                citiesNumber++;
            }
        }
        System.out.println("The population of district: " + allCities.get(540).getDistrict() + " is " + totalPopulation + ", number of cities is " + citiesNumber);

        // The population of country Bulgaria
        System.out.println("The population of country: " + allCountries.get(22).getName() + " is " + allCountries.get(22).getPopulation());

        // The population of region Eastern Europe
        int totalPopulationRegion = 0;
        for(Country country1: allCountries){
            if(country1.getRegion().equals("Eastern Europe")){
                totalPopulationRegion += country1.getPopulation();
            }
        }
        System.out.println("The population of region: " + allCountries.get(22).getRegion() + " is " + totalPopulationRegion);

        for (City curr:
             cityReport) {
            System.out.println(curr);
        }
        
        // Disconnect from database
        a.disconnect();
    }

    //Connection to MySQL database
    private Connection con = null;

    /**
     * Connects to the mysql jdbc driver
     * @return Nothing;
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            // Inform of Connectivity Processes
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }


    /**
     * // Disconnect from the MySQL database.
     * @return Nothing;
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * All the cities from MySQL world database in the region of @param country organised by largest population
     * @param country The region we aiming
     * @return ArrayList<City>
     */
    public List<City> getCitiesByLargestPopulationInCountry(Country country){
        List<City> cities = new ArrayList<>();
        String countryCode = country.getISO3Code();
        try{

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT * FROM city WHERE city.CountryCode = '" + countryCode + "' ORDER BY city.Population DESC;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()){
                City curr_city = new City(rset.getInt("ID"), rset.getString("Name"),  rset.getString("CountryCode"),rset.getString("District"),rset.getInt("Population"));
                cities.add(curr_city);
            }

        } catch (Exception e){
            return null;
        }
        return cities;
    }

    /**
     * All countries from MySQL world database stored in ArrayList data structure.
     * @return ArrayList<Country>
     */
    public List<Country> getAllCountries(){
        List<Country> countries = new ArrayList<>();
        try{

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT * FROM country";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()){
                Country curr_country = new Country(rset.getString("Code"), rset.getString("Name"),
                        rset.getString("Continent"),rset.getString("Region"),rset.getDouble("SurfaceArea"),
                            rset.getInt("IndepYear"), rset.getInt("Population"), rset.getDouble("LifeExpectancy"),
                                rset.getDouble("GNP"), rset.getDouble("GNPOld"), rset.getString("LocalName"),
                                    rset.getString("GovernmentForm"), rset.getString("HeadOfState"),
                                            rset.getInt("Capital"), rset.getString("Code2"));
                countries.add(curr_country);
            }

        } catch (Exception e){
            return null;
        }
        return countries;
    }

    /**
     * All cities from MySQL world database stored in ArrayList data structure.
     * @return ArrayList<City>
     */
    public List<City> getAllCities(){
        List<City> cities = new ArrayList<>();
        try{

            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT * FROM city";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()){
                City curr_city = new City(rset.getInt("ID"), rset.getString("Name"),  rset.getString("CountryCode"),rset.getString("District"),rset.getInt("Population"));
                cities.add(curr_city);
            }

        } catch (Exception e){
            return null;
        }
        return cities;
    }

    /** Method GET Target City Data:
     * @return City
     */
    public City getCity(int ID)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT ID, Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE ID = " + ID;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new employee if valid.

            // Check one is returned
            if (rset.next())
            {
                return new City(rset.getInt("ID"), rset.getString("Name"),  rset.getString("CountryCode"),rset.getString("District"),rset.getInt("Population"));
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    /** Method for Displaying Target Data
     * @param city The city to be displayed
     * @return Nothing
     */
    public void displayCity(City city)
    {
        if (city != null)
        {
            System.out.println(city.toString());
        }
    }
}
