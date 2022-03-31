package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BestClass {
	
	public static LoginPage lp;
	
	@Test 
	  public void login() throws InterruptedException {
	        
		lp=new LoginPage(driver);
			lp.login("Sarja Patil", "Saroja@99");
			System.out.println("login done");
	
	}
}
