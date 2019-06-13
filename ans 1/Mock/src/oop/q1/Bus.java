package oop.q1;

public class Bus extends Vehicle{
	
	private int year;
	
	private double manufacturerDiscount;
	
	public Bus(double speed, String colour, int year, double manufacturerDiscount) {
		super(speed, colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public double getSalePrice() {
		
		double salesPrice = 0.0;
		salesPrice = (super.regularPrice * (100 - manufacturerDiscount))/100;
		return salesPrice;
	}

}
