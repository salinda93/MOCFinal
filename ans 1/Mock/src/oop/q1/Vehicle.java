package oop.q1;

public abstract class Vehicle {
	
	private double speed;
	private String colour;
	public double regularPrice = 10000.00;
	
	public Vehicle(double speed, String colour) {
		super();
		this.speed = speed;
		this.colour = colour;
	}

	public Vehicle(double speed, String colour, double regularPrice) {
		super();
		this.speed = speed;
		this.colour = colour;
		this.regularPrice = regularPrice;
	}

	public abstract double getSalePrice();
}
