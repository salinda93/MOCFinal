package design.patterns.q2;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String type){
		
		if(type.equals("TV")){
			return new TVFactory();
		}
		else{
			return new MobileFactory();
		}
	}

}
