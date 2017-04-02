package com.allen;

public class Car {
	int id;
	String brand;
	String name;
	int cc;
	String type;
	int status;
	float milage;

	public Car(String brand, String name, int cc) {
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}

	public void setmilage(int m) {
		milage = m;
	}

	public float addmilage(int m) {
		milage = milage + m;
		return milage;
	}

	public void maintain() {
		status = 5;
	}
}
