package Framework.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) { 
	    this.driver = driver; 
	}
	
	@FindBy(id="userName") 
	WebElement txtUserName;
	
	@FindBy(id="password") 
	WebElement txtPassword;
	
	@FindBy(id="login") 
	WebElement btnLogin;
	
	public void login() {
		txtUserName.sendKeys("ankur");
		txtPassword.sendKeys("Mango@123");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnLogin);
	}

}
