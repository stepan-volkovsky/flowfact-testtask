package com.flowfact.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class PhoneNumber extends Model {

	private static final long serialVersionUID = 1L;

	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "AREA_CODE")
	private String areaCode;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
