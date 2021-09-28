package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassword {

	
	
		WebDriver driver;


		public ForgetPassword(WebDriver driver) {
			this.driver=driver;
		}



		By Email = By.xpath("//input[@id='ap_email']");
		By Code = By.xpath("//input[@name='code']");
		By NewPassword = By.xpath("//input[@id='ap_fpp_password']");
		By ReEnterPassword = By.xpath("//input[@id='ap_fpp_password_check']");
		By Continuebtn = By.xpath("//input[@id='continue']");
		By SignInbtn = By.xpath("//div[@id='nav-flyout-ya-signin']//span[contains(text(),'Sign in')]");



		//Method to SignIn
		public void forgetPassword(String email, String newpassword,String reenterpassword, String code ) {
			driver.findElement(SignInbtn).click();
			driver.findElement(Email).sendKeys(email);
			driver.findElement(Continuebtn).click();
			driver.findElement(Code).sendKeys(code);
			driver.findElement(Continuebtn).click();
			driver.findElement(NewPassword).sendKeys(newpassword);
			driver.findElement(ReEnterPassword).sendKeys(reenterpassword);
			driver.findElement(Continuebtn).click();

		}

	}



