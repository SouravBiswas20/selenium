package pageObjectModel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	//encapsulation=Private Data+Public method for data
	
	private WebDriver driver;
	
	//initialize driver
	public Login_Page(WebDriver driver)//this driver taking from base class driver
	{
		this.driver=driver;
	}
	
	
	//By locator technique
	
	private By un=By.name("username");
	private By psw=By.name("password");
	private By btn=By.xpath("//button[@type='submit']");
	
	//public method--Action
	
	public void doLogin(String username,String password) 
	
	{
		driver.findElement(un).sendKeys(username);
		driver.findElement(psw).sendKeys(password);
		driver.findElement(btn).click();
		
	}
	
	
	
	
	public String getUrl() {
		
		return driver.getCurrentUrl();
		
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
}
