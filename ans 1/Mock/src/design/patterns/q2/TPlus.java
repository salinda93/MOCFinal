package design.patterns.q2;

public class TPlus extends MobilePhone{
	
	public TPlus() {
		super.model = "TPlus";
		super.price = 76000.00;
	}

	@Override
	public void display() {
		System.out.println("The model is = " + super.model + " and price is = " + super.price);
	}

}
