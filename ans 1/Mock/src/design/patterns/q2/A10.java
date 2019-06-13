package design.patterns.q2;

public class A10 extends MobilePhone{
	
	public A10() {
		super.model = "A10";
		super.price = 80000.00;
	}
	

	@Override
	public void display() {
		System.out.println("The model is = " + super.model + " and price is = " + super.price);
	}

}
