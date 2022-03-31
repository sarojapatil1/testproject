package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;




public class Sreeenshot {
	
	public static void capturescrenshot(WebDriver driver,String name ) throws IOException {
		TakesScreenshot s=(TakesScreenshot)driver;
		File capture=s.getScreenshotAs(OutputType.FILE);
		//File dest=new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".jpg");
		File dest=new File("E:\\SAROJA\\project m\\Screenshot\\"+name+".png");
		  
		FileHandler.copy(capture, dest);
		System.out.println("capture screenshot");
	}
}
