package Framework.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
	
	@Test
	public void TC01() {
		String url = "https://demoqa.com/books";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		homepage.btnLogin.click();
		loginpage.login();
		
	}
	
	#Add TC02, 03
	#add TC04, 05
}
