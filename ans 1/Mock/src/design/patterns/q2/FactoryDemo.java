package design.patterns.q2;

public class FactoryDemo {

	public static void main(String[] args) {
		
		FactoryProducer.getFactory("TV").getTVmodel("Alpha40").display();
		FactoryProducer.getFactory("TV").getTVmodel("Gamma50").display();
		FactoryProducer.getFactory("TV").getTVmodel("Theta65").display();
		
		FactoryProducer.getFactory("Phone").getPhoneModel("A10").display();
		FactoryProducer.getFactory("Phone").getPhoneModel("X25").display();
		FactoryProducer.getFactory("Phone").getPhoneModel("TPlus").display();
	}

}
