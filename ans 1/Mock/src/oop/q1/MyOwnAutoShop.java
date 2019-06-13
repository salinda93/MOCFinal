package oop.q1;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Truck(150, "Blue", 1000);
		System.out.println(vehicle.getSalePrice());
		
		Vehicle truck = new Truck(160, "Red", 3000);
		System.out.println(truck.getSalePrice());
		
		Vehicle bus = new Bus(250, "White", 2017, 40);
		System.out.println(bus.getSalePrice());

	}

}
