package com.flowfact.test.dao;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.flowfact.test.IAddressManager;
import com.flowfact.test.vo.IAddress;
import com.flowfact.test.vo.IPhoneNumber;

@Component
public class AddressManager implements IAddressManager{

	public void storeAddreess(IAddress iAddr) {
		// TODO Auto-generated method stub
		
	}

	public Set<IAddress> searchAddresses(long id, String postalCode,
			String country, String countryArea, String city, String cityArea,
			String streetLine0, String streetLine1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<IPhoneNumber> getPhoneNumbers(long addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAddress(long addressId) {
		// TODO Auto-generated method stub
		
	}

	public void addPhoneNum(long addressId, IPhoneNumber phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	public void deletePhoneNum(long addressId, IPhoneNumber phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAddress(long addressId) {
		// TODO Auto-generated method stub
		
	}

}
