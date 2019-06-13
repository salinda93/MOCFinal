package design.patterns.q2;

public class Alpha40 extends TV{
	
	public Alpha40() {
		super.model = "Alpha40";
		super.size = "65 inches";
	}

	@Override
	public void display() {
		System.out.println("The TV model = " + super.model + ", the TV size is = " + super.size);
	}

}
