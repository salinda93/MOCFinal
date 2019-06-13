package design.patterns.q2;

public abstract class AbstractFactory {
	
	public abstract TV getTVmodel(String model);
	
	public abstract MobilePhone getPhoneModel(String model);

}
