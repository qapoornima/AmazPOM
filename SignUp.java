package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {


		WebDriver driver;


		public SignUp(WebDriver driver) {
			this.driver=driver;
		}


		By CustomerName = By.xpath("//input[@name='customerName']");
		By StartHere = By.xpath("//div[@id= 'nav-flyout-ya-newCust']/a");
		By Email = By.xpath("//input[@id='ap_email']");
		By Password = By.xpath("//input[@id='ap_password']");
		By ConfirmPassword = By.xpath("//input[@id='ap_password_check']");
		By Continuebtn = By.xpath("//input[@id='continue']");
		By Logout = By.xpath("//span[contains(text(),'Sign Out')]");

		//Method to click start here
		
		public void clickOnStartHere() {
			driver.findElement(StartHere).click();
		}
		
		
		//Method to enter customer name
		public void enterCustomername(String name) {
			driver.findElement(CustomerName).sendKeys(name);
		}

		//Method to enter email
		public void enterEmail(String email) {
			driver.findElement(Email).sendKeys(email);
		}


		//Method to enter password
		public void enterPassword(String password) {
			driver.findElement(Password).sendKeys(password);
		}

		//Method to enter confirm password
		public void enterConfirmPassword(String confirmpassword) {
			driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
		}

		//Method to click on continue button
		public void clickContinue() {
			driver.findElement(Continuebtn).click();
		}
		
		public void logout() {
			driver.findElement(Logout).click();
		}


	}





