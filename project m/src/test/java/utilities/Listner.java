package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BestClass;
import tests.LoginTest;

public class Listner extends LoginTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		System.out.println("listner class");
		try {
			Sreeenshot.capturescrenshot(driver,name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}