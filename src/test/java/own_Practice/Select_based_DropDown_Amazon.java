package own_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_based_DropDown_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		//type:1
		Select sc=new Select(driver.findElement(By.id("searchDropdownBox")));
		//or
		//Type:2
	//	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	//	Select sc =new Select(all);
		
		
		
		
		//to confirm is DropDown support multiple selection..
				//use method from select class----->> isMultiple()
		
		System.out.println("is dropdown multiple selection:"+sc.isMultiple());
		
		
		//to get all option from DropDown ,,we use method----->getOption()
		
		List<WebElement>list=sc.getOptions();
		System.out.println("total option on dropdown"+list.size());
		
		for(WebElement i:list) {
			System.out.println(i.getText());
			
		}
		
		// For single value selection,under select class we have 3 method to use:
		//1.selectByIndex()
		//2.selectByVisibleText()
		//3.selectByValue()
		
		//selectByVisibleText()
		
		sc.selectByVisibleText("Car & Motorbike");
		Thread.sleep(2000);
		sc.selectByVisibleText("Under ₹500");
		Thread.sleep(2000);
		
		//selectByValue()
		sc.selectByValue("search-alias=alexa-skills");
		Thread.sleep(2000);
		sc.selectByValue("search-alias=beauty");
		Thread.sleep(2000);
		
		//selectByIndex()
		sc.selectByIndex(0);
		Thread.sleep(2000);
		sc.selectByIndex(43);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
