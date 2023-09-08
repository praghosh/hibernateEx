
public class UserLogin {
	
 
	private User user;


	public UserLogin(User user) {
		this.user=user;
	}

	public boolean login(String username, String password) {

		if ( "".equals(username) || "".equals(password)) {

			return false;
		}
		if ( username.equals(user.username) && password.equals(user.passwd)) {
			return true;
		}
		return false;

	}
}
