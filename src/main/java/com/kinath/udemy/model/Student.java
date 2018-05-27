package com.kinath.udemy.model;


import java.util.HashMap;
import java.util.List;

public class Student
{
    private String firstName;
    private String lastName;
    private String country;

    private HashMap<String, String> countryOptions;

    private String favouriteLanguage;

    private List<String> operatingSystems;

    public Student()
    {
        countryOptions = new HashMap<String, String>();
        countryOptions.put( "BR", "Brazil" );
        countryOptions.put( "FR", "France" );
        countryOptions.put( "GE", "Germany" );
        countryOptions.put( "IN", "India" );
        countryOptions.put( "LK", "Sri Lanka" );
        countryOptions.put( "PK", "Pakistan" );
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }

    public HashMap<String, String> getCountryOptions()
    {
        return countryOptions;
    }

    public void setCountryOptions( HashMap<String, String> countryOptions )
    {
        this.countryOptions = countryOptions;
    }

    public String getFavouriteLanguage()
    {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage( String favouriteLanguage )
    {
        this.favouriteLanguage = favouriteLanguage;
    }

    public List<String> getOperatingSystems()
    {
        return operatingSystems;
    }

    public void setOperatingSystems( List<String> operatingSystems )
    {
        this.operatingSystems = operatingSystems;
    }
}
