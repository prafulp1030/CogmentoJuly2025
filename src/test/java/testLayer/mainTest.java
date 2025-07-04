package testLayer;

import pages.LoginPage;

public class mainTest {

	public static void main(String[] args) {

		LoginPage login =new LoginPage();
		
		login.loginFunctionality("Admin", "admin123");
		
		
	}

}
