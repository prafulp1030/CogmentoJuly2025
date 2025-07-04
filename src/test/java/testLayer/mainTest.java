package testLayer;

import pages.HomePage;
import pages.LoginPage;
import pages.PimPage;

public class mainTest {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();

		login.loginFunctionality("Admin", "admin123");

		HomePage homePage = new HomePage();

		homePage.validateLogo();

		PimPage pim = new PimPage();

		pim.clickOnPimLink();
		
		pim.clickOnAddEmployee();
		
		pim.createEmployee();
		
		pim.addMoreEmployeeDetails();
		
		pim.searchEmployee();
		
		pim.deleteEmployee();
	}

}
