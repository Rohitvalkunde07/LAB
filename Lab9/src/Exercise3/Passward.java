package Exercise3;

public class Passward {

	public static void main(String[] args) {
		String name = "ROHIT";
		String pass = "Rohit@77";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("ROHIT", "Rohit@77"));
	}

}
