package com.flowfact.test.vo;

import java.util.Set;

public interface IAddress {

    public abstract Long getId(); //ID
    
    public abstract String getPostcode(); //PC

    public abstract String getCountry(); //CR

    public abstract String getCountryArea(); //CRA

    public abstract String getCity(); //CT

    public abstract String getCityArea(); //CTA

    public abstract String getStreetLine0(); //SL0

    public abstract String getStreetLine1(); //SL1

    public abstract Set<IPhoneNumber> getPhoneNumbers(); //PN

}