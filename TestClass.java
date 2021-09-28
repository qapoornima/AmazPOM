package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.ForgetPassword;
import Pages.Login;
import Pages.ProfileUpload;
import Pages.SignUp;

public class TestClass {

	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException
	{


		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the URL 
		driver.get("https://www.amazon.com/");


		driver.manage().window().maximize();

		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		//Instantiate Action Class        
		Actions actions = new Actions(driver);
		//Retrieve WebElement 'Music' to perform mouse hover 
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Hello')]"));
		//Mouse hover menuOption 'Music'
		actions.moveToElement(signIn).perform();
		System.out.println("Done Mouse hover on 'Hello, Sign in");

		//Creating object of SignUp page
		SignUp signup = new SignUp(driver);

		//Creating object of Login page
		Login login = new Login(driver);

		//Creating object of Forget Password
		ForgetPassword forgetPasssword = new ForgetPassword(driver);

		//Creating object of ProfileUpload

		ProfileUpload pic = new ProfileUpload(driver);



		signup.clickOnStartHere();
		signup.enterCustomername("Amazon");
		signup.enterEmail("cokot26542@vefblogg.com");
		signup.enterPassword("123456");
		signup.enterConfirmPassword("123456");
		signup.clickContinue();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/");

		actions.moveToElement(signIn).perform();

		signup.logout();

		//login

		login.signIn("cokot26542@vefblogg.com","123456");
		driver.navigate().to("https://www.amazon.in/gp/profile/");
		pic.UploadProfilePic("C:\\Users\\dell\\Documents\\picture\\pic.jpeg");

		login.logout();
		driver.navigate().to("https://www.amazon.com/");

		actions.moveToElement(signIn).perform();

		forgetPasssword.forgetPassword("cokot26542@vefblogg.com","1234567","1234567","1234");



		// Close the main window 
		driver.close();
	}
}

