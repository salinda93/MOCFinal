package design.patterns.q2;

public class Theta65 extends TV{
	
	public Theta65() {
		super.model = "Theta65";
		super.size = "120 inches";
	}

	@Override
	public void display() {
		System.out.println("The TV model = " + super.model + ", the TV size is = " + super.size);
	}
	
}
