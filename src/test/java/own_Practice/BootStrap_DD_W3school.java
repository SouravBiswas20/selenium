package own_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_DD_W3school {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		List<WebElement> list=driver.findElements(By.xpath("(//ul)[1]//li//a"));
		
		System.out.println("total no of component in DD:\t"+list.size());
		
		for(WebElement i:list) {
			
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
