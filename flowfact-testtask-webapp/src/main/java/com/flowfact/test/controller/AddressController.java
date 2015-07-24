package com.flowfact.test.controller;

import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flowfact.test.dao.IAddressDAO;
import com.flowfact.test.model.Address;
import com.flowfact.test.model.PhoneNumber;

@Component
@RestController
@RequestMapping("/address")
public class AddressController {

	@Inject
	private IAddressDAO addressDAO;

	@RequestMapping(method = RequestMethod.PUT)
	public void storeAddreess(@RequestBody Address addr) {
		addressDAO.put(addr);
	}

	@RequestMapping(method = RequestMethod.GET)
	// @formatter:off
	public Set<Address> searchAddresses(
			@RequestParam(value = "ID", required = false) Long id,
			@RequestParam(value = "PC", required = false) String postalCode,
			@RequestParam(value = "CR", required = false) String country,
			@RequestParam(value = "CRA", required = false) String countryArea,
			@RequestParam(value = "CT", required = false) String city,
			@RequestParam(value = "CTA", required = false) String cityArea,
			@RequestParam(value = "SL0", required = false) String streetLine0,
			@RequestParam(value = "SL1", required = false) String streetLine1) {
		// @formatter:on
		return addressDAO.search(id, postalCode, country, countryArea, city,
				cityArea, streetLine0, streetLine1);
	}

	@RequestMapping(value = "/phonenum", method = RequestMethod.GET)
	public Set<PhoneNumber> getPhoneNumbers(@RequestParam("ID") long addressId) {
		return addressDAO.getPhoneNumbers(addressId);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void updateAddress(@RequestBody Address addr) {
		addressDAO.update(addr);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteAddress(@RequestParam("ID") Long addressId) {
		addressDAO.delete(addressId);
	}

}
