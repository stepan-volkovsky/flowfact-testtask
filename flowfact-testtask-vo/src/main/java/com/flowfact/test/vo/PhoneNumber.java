package com.flowfact.test.vo;

public class PhoneNumber {

    private final int counryCode;
    private final int areaCode;
    private final int phoneNumber;

    public PhoneNumber(int counryCode, int areaCode, int phoneNumber) {
        super();
        this.counryCode = counryCode;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber(PhoneNumber another) {
        this(another.getCounryCode(), another.getAreaCode(), another.getPhoneNumber());
    }
    
    public PhoneNumber(String phoneNumberString){
        
    }

    public int getCounryCode() {
        return counryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

}
