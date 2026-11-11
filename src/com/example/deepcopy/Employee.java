package com.example.deepcopy;

class Employee {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.address = new Address(employee.address);
    }
}

