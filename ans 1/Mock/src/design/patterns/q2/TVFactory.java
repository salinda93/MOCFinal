package design.patterns.q2;

public class TVFactory extends AbstractFactory{

	@Override
	public TV getTVmodel(String model) {
		
		if(model.equals("Alpha40")){
			return new Alpha40();
		}
		else if(model.equals("Theta65")){
			return new Theta65();
		}
		else{
			return new Gamma50();
		}
	}

	@Override
	public MobilePhone getPhoneModel(String model) {
		return null;
	}
	

}
