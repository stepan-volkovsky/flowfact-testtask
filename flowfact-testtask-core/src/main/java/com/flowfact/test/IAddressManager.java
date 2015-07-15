package com.flowfact.test;

import java.util.Set;

import com.flowfact.test.vo.IAddress;
import com.flowfact.test.vo.IPhoneNumber;

public interface IAddressManager {

    public abstract void storeAddreess(IAddress iAddr);

    // @formatter:off
    public abstract Set<IAddress> searchAddresses(  long id, 
                                                    String postalCode, 
                                                    String country, 
                                                    String countryArea, 
                                                    String city, 
                                                    String cityArea,
                                                    String streetLine0, 
                                                    String streetLine1);
    // @formatter:on
    
    public abstract Set<IPhoneNumber> getPhoneNumbers(long addressId);

    public abstract void updateAddress(long addressId);

    public abstract void addPhoneNum(long addressId, IPhoneNumber phoneNumber);

    public abstract void deletePhoneNum(long addressId, IPhoneNumber phoneNumber);

    public abstract void deleteAddress(long addressId);

}
