package com.example.clone;

public class Employee implements Cloneable{
	int id = 101;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
