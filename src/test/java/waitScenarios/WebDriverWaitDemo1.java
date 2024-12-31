package waitScenarios;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");

		
		System.out.println("....visibilityofElementLocated()....");
		By inputbox = By.xpath("//input[@type='text']");
	//	WebDriverWait obj = new WebDriverWait(driver, Duration.ofSeconds(5));
	//WebElement inputbox1 = obj.until(ExpectedConditions.visibilityOfElementLocated(inputbox));
	//inputbox1.sendKeys("billa");	
		//or
		utility.Static_Methods.waitforVisibilityOfElement(driver, inputbox).sendKeys("billa");
		
		

		
		System.out.println("....PresenceofElementlocated()....");
		By signin = By.linkText("Sign In");
		//WebDriverWait obj1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		//WebElement signin1 = obj1.until(ExpectedConditions.presenceOfElementLocated(signin));
		//signin1.click();
//or
		utility.Static_Methods.waitforPresenceOfElement(driver, signin).click();
		
		
		System.out.println("....elementToBeClickable()....");
		By btn=By.id("submit-id");
	//	WebDriverWait obj2 = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	WebElement btn1=obj2.until(ExpectedConditions.elementToBeClickable(btn));
	//	btn1.click();
	//or	
		utility.Static_Methods.waitforElementClickable(driver, btn).click();
        
		
		System.out.println("....urlContains()....");
		String currenturl=driver.getCurrentUrl();
	//	WebDriverWait obj3=new WebDriverWait(driver,Duration.ofSeconds(7));
	//	Boolean url=obj3.until(ExpectedConditions.urlContains(currenturl));
	//	System.out.println(url);
	//or	
		Boolean url=utility.Static_Methods.waitforUrlContains(driver, currenturl);
		System.out.println(url);
		
		System.out.println("....titlecontains()....");
		String title=driver.getTitle();
	//	WebDriverWait obj4=new WebDriverWait(driver,Duration.ofSeconds(5));
	//	Boolean title1=obj4.until(ExpectedConditions.titleContains(title));
	//	System.out.println(title1);
	//or
		Boolean title1=utility.Static_Methods.waitforTitleContains(driver, title);
		System.out.println(title1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
