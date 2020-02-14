package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App
{
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

        System.out.println("Total cities: " + a.getAllCities().size());

        System.out.println("First city in the list: " + a.getAllCities().get(0).toString());

        // Disconnect from database
        a.disconnect();
    }

    //Connection to MySQL database
    private Connection con = null;

    // Method to connect to the MySQL database.
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

    // Disconnect from the MySQL database.
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

    // Method GET Target City Data:
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

    // Method for Displaying Target Data:
    public void displayCity(City city)
    {
        if (city != null)
        {
            System.out.println(city.toString());
        }
    }
}
