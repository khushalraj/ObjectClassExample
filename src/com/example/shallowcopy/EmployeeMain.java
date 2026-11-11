package com.example.shallowcopy;

public class EmployeeMain {
	
	    public static void main(String[] args) throws Exception {

	        Address address = new Address("Bangalore");

	        Employee e1 = new Employee(101, "Naveen", address);

	        Employee e2 = (Employee) e1.clone();

	        e2.address.city = "Hyderabad";

	        System.out.println(e1.address.city);
	        System.out.println(e2.address.city);
	    }
}
