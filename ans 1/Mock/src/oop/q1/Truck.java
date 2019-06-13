package oop.q1;

public class Truck extends Vehicle{

	private double weight;

	public Truck(double speed, String colour, double weight) {
		super(speed, colour);
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		
		double salesPrice = 0.0;
		
		if(weight > 2000){
			salesPrice = (super.regularPrice * 90)/100;
		}
		else{
			salesPrice = (super.regularPrice * 80)/100;
		}
		return salesPrice;
	} 
}
