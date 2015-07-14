package com.flowfact.test;

import java.util.Set;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flowfact.test.vo.IAddress;
import com.flowfact.test.vo.IPhoneNumber;

@RestController
@RequestMapping("/address")
public class AddressController {

    @RequestMapping(method = RequestMethod.PUT)
    public void storeAddreess(@RequestBody IAddress iAddr) {
    }

    @RequestMapping(method = RequestMethod.GET)
    // @formatter:off
    public Set<IAddress> searchAddresses(   @RequestParam("ID") long id, 
                                            @RequestParam("PC") String postalCode, 
                                            @RequestParam("CR") String country, 
                                            @RequestParam("CRA") String countryArea, 
                                            @RequestParam("CT") String city, 
                                            @RequestParam("CTA") String cityArea, 
                                            @RequestParam("SL0") String streetLine0, 
                                            @RequestParam("SL1") String streetLine1) {
     // @formatter:on
        return null;
    }

    @RequestMapping(value = "/phonenum", method = RequestMethod.GET)
    public Set<IPhoneNumber> getPhoneNumbers(@RequestParam("ID") long addressId) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void updateAddress(@RequestParam("ID") long addressId) {
    }

    @RequestMapping(value = "/phonenum", method = RequestMethod.POST)
    public void addPhoneNum(@RequestParam("ID") long addressId, @RequestBody IPhoneNumber phoneNumber) {

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAddress(@RequestParam("ID") long addressId) {
    }

}
