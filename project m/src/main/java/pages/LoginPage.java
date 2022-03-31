package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
	
	@FindBy(css="input#email")
	private WebElement useranme;
	
	@FindBy(css="input#pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass) {
		
		useranme.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	

}
