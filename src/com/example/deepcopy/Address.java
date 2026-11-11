package com.example.deepcopy;

public class Address {
	 String city;

	    Address(String city) {
	        this.city = city;
	    }

	    // Copy constructor
	    Address(Address address) {
	        this.city = address.city;
	    }
}
