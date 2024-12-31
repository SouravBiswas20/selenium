package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait_WebDriverWait_Demo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
	By btn=	By.xpath("//button[text()='Start']");
	By text=By.xpath("(//h4)[2]");
	
	
	//create object of WebDriverWait class--->1st step
	WebDriverWait obj= new WebDriverWait(driver,Duration.ofSeconds(5));
	//WebElement btn1=obj.until(ExpectedConditions.elementToBeClickable(btn));	
		obj.until(ExpectedConditions.presenceOfElementLocated(btn)).click();
	//	btn1.click();
		
	WebDriverWait obj1= new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement text1=obj1.until(ExpectedConditions.visibilityOfElementLocated(text));
		
		System.out.println(text1.getText());
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
