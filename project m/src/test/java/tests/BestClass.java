package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestClass {
	
 public static WebDriver driver;
 
	@BeforeSuite
	public void start() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";

		FileInputStream fis =new FileInputStream(path);

		Properties prop =new Properties();
		prop.load(fis);

		driver.get(prop.getProperty("url"));

	}
@AfterSuite
public void teardown() {
	driver.close();
}
}
