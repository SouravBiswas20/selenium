package webHandlingSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrame_Demo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		 
		
		//you can automate simple frame/iframe ,with help of 3 methods:
		
		
		
		//1. frame by id/ name 
		driver.switchTo().frame("id/name");
		
		
		//2. frame by index no (this index no specify by the developer)
		driver.switchTo().frame("index no");
		
		
		//3.frame by webElement
		driver.switchTo().frame("WebElement");
		
		
		
		
		
		
		

	}

}
