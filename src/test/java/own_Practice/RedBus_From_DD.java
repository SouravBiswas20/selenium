package own_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_From_DD {

	public static void main(String[] args) {
		
		//to disable notification from redBus ,we use Options class from Selenium interface.
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		WebElement from=driver.findElement(By.id("src"));
		
		from.click();
		from.sendKeys("Kolkata");
		
		
	/*	
	List<WebElement>list=driver.findElements(By.xpath("(//ul)[4]//li//div"));
	
	System.out.println("total no of element on from:"+list.size());
	
	for(WebElement i:list) {
		
		System.out.println(i.getText());
	}
		*/
	List<WebElement>list1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li//text[@class='placeHolderMainText']"));
		
		System.out.println("total no of element on from DD:\t"+list1.size());
		
		for(WebElement i:list1) {
			System.out.println(i.getText());
			
			if(i.getText().contains("Airport")) {
				i.click();
				break;
			}
			
		}
		
		
		

	}

}
