package com.flowfact.test.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.flowfact.test.vo.IPhoneNumber;

@Entity
@Table
public class PhoneNumber extends Model implements IPhoneNumber {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@Column(name = "COUNTRY_CODE")
	private Integer countryCode;

	@Column(name = "AREA_CODE")
	private Integer areaCode;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	public Integer getCountryCode() {
		return countryCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

}
