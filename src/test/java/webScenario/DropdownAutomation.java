package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("title is :"+driver.getTitle());
		
		//identify select base dropdown..
		
   	Select dd1=new Select(driver.findElement(By.name("url")));
		                     //OR
//	WebElement ele=	driver.findElement(By.name("url"));
	           //    ele.click();
	
	
		//Select dd1=new Select(ele);
		
		System.out.println("is dropdown supports multiple selection :"+dd1.isMultiple());
		
		//how to select any single element from the dropdown?
		/*
		 * 3 method avilable for this...
		 */
		dd1.selectByIndex(0); //0,2,4,6...this value give by developer..
		Thread.sleep(2000);
		dd1.selectByIndex(2);
		Thread.sleep(2000);
		dd1.selectByIndex(4);
		Thread.sleep(2000);
		dd1.selectByIndex(6);
		Thread.sleep(2000);
		                        //OR
		dd1.selectByVisibleText("Alexa Skills");
		Thread.sleep(2000);
		dd1.selectByVisibleText("Amazon Fashion");
		Thread.sleep(2000);
		dd1.selectByVisibleText("Amazon Pharmacy");
		Thread.sleep(2000);
		dd1.selectByVisibleText("Apps & Games");
		Thread.sleep(2000);
		                        //OR
		dd1.selectByValue("search-alias=alexa-skills");
		Thread.sleep(2000);
		dd1.selectByValue("search-alias=amazon-devices");
		Thread.sleep(2000);
		dd1.selectByValue("search-alias=fashion");
		
		//print all options from the dropdown...
		List <WebElement>alloption=dd1.getOptions();
		System.out.println("total no of option on amazon dropdown :"+alloption.size());
		
		for(WebElement i:alloption)
		{
			
			System.out.println("text of all option on amazon dropdown :"+i.getText());
			
		}
		
		
		
		
		
		
		
		

	}

}
