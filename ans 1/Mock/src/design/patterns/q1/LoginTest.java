package design.patterns.q1;

class Login {
	
	private static Login instance = null;
	
	private Login(){}
	
	public static Login getInstance(){
		if(instance == null){
			instance = new Login();
			System.out.println("Instance created");
		}
		return instance;
	}
	
	public boolean validateUser(String userName, String password){
		
		return userName.equals(password);
	}
}

public class LoginTest{
	
	public static void main(String[] args) {
		
		

		for (int i = 0; i < 10; i++) {
			System.out.println(Login.getInstance().validateUser("Manju", "Manju"));
		}
	}
}

