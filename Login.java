package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	

		WebDriver driver;


		public Login(WebDriver driver) {
			this.driver=driver;
		}



		By Email = By.xpath("//input[@id='ap_email']");
		By Password = By.xpath("//input[@id='ap_password']");
		By Continuebtn = By.xpath("//input[@id='continue']");
		By SignInbtn = By.xpath("//input[@id='signInSubmit']");
		By Logout = By.xpath("//span[contains(text(),'Sign Out')]");



		//Method to SignIn
		public void signIn(String email, String password) {
			driver.findElement(Email).sendKeys(email);
			driver.findElement(Continuebtn).click();
			driver.findElement(Password).sendKeys(password);
			driver.findElement(SignInbtn).click();

		}
		public void logout() {
			driver.findElement(Logout).click();
		}
	}







