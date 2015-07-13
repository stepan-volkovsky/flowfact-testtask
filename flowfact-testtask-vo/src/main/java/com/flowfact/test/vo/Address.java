package com.flowfact.test.vo;

import java.util.HashSet;
import java.util.Set;

public class Address {

    private final String           postcode;
    private final String           country;
    private final String           countryArea;
    private final String           city;
    private final String           cityArea;
    private final String           streetLine0;
    private final String           streetLine1;
    private final Set<PhoneNumber> phoneNumbers = new HashSet<PhoneNumber>();

    public Address(String postcode, String country, String countryArea, String city, String cityArea, String streetLine0, String streetLine1,
            Set<PhoneNumber> phoneNumbers) {
        super();
        this.postcode = postcode;
        this.country = country;
        this.countryArea = countryArea;
        this.city = city;
        this.cityArea = cityArea;
        this.streetLine0 = streetLine0;
        this.streetLine1 = streetLine1;
        this.phoneNumbers.addAll(phoneNumbers);
    }

    public Address(Address another) {
        //@formatter:off
        this(another.getPostcode(), 
             another.getCountry(), 
             another.getCountryArea(), 
             another.getCity(), 
             another.getCityArea(), 
             another.getStreetLine0(), 
             another.getStreetLine1(), 
             another.getPhoneNumbers()
             );
        //@formatter:on
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryArea() {
        return countryArea;
    }

    public String getCity() {
        return city;
    }

    public String getCityArea() {
        return cityArea;
    }

    public String getStreetLine0() {
        return streetLine0;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public Set<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

}
