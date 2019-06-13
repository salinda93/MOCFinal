package design.patterns.q2;

public class Gamma50 extends TV{
	
	public Gamma50() {
		super.model = "Gamma50";
		super.size = "77 inches";
	}

	@Override
	public void display() {
		System.out.println("The TV model = " + super.model + ", the TV size is = " + super.size);
	}
	
}
