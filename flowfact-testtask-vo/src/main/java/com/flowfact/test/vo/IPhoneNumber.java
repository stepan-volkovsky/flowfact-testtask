package com.flowfact.test.vo;

public interface IPhoneNumber {

    public abstract Long getId();
    
    public abstract Integer getCountryCode();

    public abstract Integer getAreaCode();

    public abstract String getPhoneNumber();

}