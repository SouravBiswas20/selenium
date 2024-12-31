package own_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class RedBus_To_DD {

	public static void main(String[] args) {
		
		
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
	WebElement tolist=	driver.findElement(By.id("dest"));
	tolist.click();
	tolist.sendKeys("kgp");
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));
	
	System.out.println("total no of element on to DD:\t"+list.size());
		
		for(WebElement i:list) {
			System.out.println(i.getText());
			
			if(i.getText().contains("Kapadvanj")) {
				i.click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
