package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownDemo1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/default.asp");
		
		
		//click on tutorials dropdown...
		WebElement tutorial=driver.findElement(By.xpath("(//a//i)[2]"));
		tutorial.click();
		String title=driver.getTitle();
		System.out.println(title);
		List<WebElement>pagetext=driver.findElements(By.xpath("//div[@id='tutorials_list']//h3"));
		System.out.println("total no text is :"+pagetext.size());
		for(WebElement i:pagetext) {
			
			System.out.println("page text are :"+i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
