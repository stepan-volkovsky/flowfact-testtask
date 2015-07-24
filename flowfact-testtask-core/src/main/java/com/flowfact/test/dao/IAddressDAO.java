package com.flowfact.test.dao;

import java.util.Set;

import com.flowfact.test.model.Address;
import com.flowfact.test.model.PhoneNumber;

public interface IAddressDAO {

	public abstract Set<Address> search(Long id, String postalCode,
			String country, String countryArea, String city, String cityArea,
			String streetLine0, String streetLine1);

	public abstract void put(Address address);

	public abstract void update(Address address);

	public abstract void delete(Long addressId);

	public abstract Set<PhoneNumber> getPhoneNumbers(Long addressId);

}
