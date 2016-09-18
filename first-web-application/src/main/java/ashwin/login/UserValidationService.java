package ashwin.login;

public class UserValidationService {

	public boolean isUserValid(String user, String pass){
		if(user.equals("Admin") && pass.equals("admin"))
			return true;
		else
			return false;
	}
}
