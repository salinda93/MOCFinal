package design.patterns.q2;

public class X25 extends MobilePhone{
	
	public X25() {
		super.model = "X25";
		super.price = 82000.00;
	}
	
	@Override
	public void display() {
		System.out.println("The model is = " + super.model + " and price is = " + super.price);
	}

}
