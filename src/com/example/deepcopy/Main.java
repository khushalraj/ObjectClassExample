package com.example.deepcopy;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(
            101, "Naveen", new Address("Bangalore")
        );

        Employee e2 = new Employee(e1);

        e2.address.city = "Hyderabad";

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);
    }
}
