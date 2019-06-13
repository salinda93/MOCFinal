package design.patterns.q2;

public class MobileFactory extends AbstractFactory{
	

	@Override
	public MobilePhone getPhoneModel(String model) {
		
		if(model.equals("X25")){
			return new X25();
		}
		else if(model.equals("A10")){
			return new A10();
		}
		else {
			return new TPlus();
		}
	}

	@Override
	public TV getTVmodel(String model) {
		return null;
	}
}
