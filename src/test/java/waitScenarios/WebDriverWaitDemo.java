package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		By email=By.id("input-email");
		By psw=By.id("input-password");
		By btn=By.xpath("//input[@type='submit']");
		
		
		//1st create create WebDriverWait class object and 
		//in constructor pass two arguments:
		//1.driver       2.Duration.ofSeconds()
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//just to interact with web element we use until() 
		//and in until method we pass ExpectedConditions class 
		//than,as per the functionality of web element you can chose method from 
		//ExpectedConditions class
		WebElement email1=obj.until(ExpectedConditions.presenceOfElementLocated(email));
		
		email1.sendKeys("test@123");
		
		WebDriverWait obj1=new WebDriverWait(driver,Duration.ofSeconds(5));
		
	WebElement btn1=obj1.until(ExpectedConditions.elementToBeClickable(btn));
		
		btn1.click();
		
		WebDriverWait obj2=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement psw1=obj2.until(ExpectedConditions.visibilityOfElementLocated(psw));
		psw1.sendKeys("123456");
		
		
		
		
		
		
		

	}

}
