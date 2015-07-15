package com.flowfact.test.dao.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.flowfact.test.vo.IAddress;
import com.flowfact.test.vo.IPhoneNumber;

@Entity
@Table
public class Address extends Model implements IAddress {

	private static final long serialVersionUID = 1L;

	@Column(name = "POSTCODE")
	private String postcode;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "COUNTRY_AREA")
	private String countryArea;

	@Column(name = "CITY")
	private String city;

	@Column(name = "CITY_AREA")
	private String cityArea;

	@Column(name = "STREET_LINE_0")
	private String streetLine0;

	@Column(name = "STREET_LINE_1")
	private String streetLine1;

	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
	private Collection<PhoneNumber> phoneNumbers;

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryArea(String countryArea) {
		this.countryArea = countryArea;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}

	public void setStreetLine0(String streetLine0) {
		this.streetLine0 = streetLine0;
	}

	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	public void setPhoneNumbers(Collection<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
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

	public Set<IPhoneNumber> getPhoneNumbers() {
		Set<IPhoneNumber> result = new HashSet<IPhoneNumber>(
				phoneNumbers.size());
		result.addAll(phoneNumbers);
		return result;
	}

}
