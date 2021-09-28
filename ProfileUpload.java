package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileUpload {

	
	
	
	WebDriver driver;


	public ProfileUpload(WebDriver driver) {
		this.driver=driver;
	}


	By PictureUploadbtn = By.xpath("//img[@alt='Upload a public profile picture']");
	By Submitbtn = By.xpath("//div[@id= 'nav-flyout-ya-newCust']/a");
	

	//Method to click start here
	
	public void UploadProfilePic(String image) {
		//WebElement image = driv
		driver.findElement(PictureUploadbtn).sendKeys(image);
		driver.findElement(Submitbtn).click();
	}
	
}
