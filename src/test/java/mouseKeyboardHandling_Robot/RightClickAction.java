package mouseKeyboardHandling_Robot;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//get the maximum size of window
		driver.manage().window().maximize();
		
		WebElement Rbtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(Rbtn).build().perform();//right click on web element
		
	List<WebElement>list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	
	System.out.println("no of element on list:\t"+list.size());
	
	//iterate and capture all text on console
	
	for(WebElement i:list) {
		
		System.out.println(i.getText());
		
		if(i.getText().contains("Quit")) {
			
			i.click();
			break;
		}
	}
		//alert handling(alert display when you click on specific list element)
		
		Alert alt=driver.switchTo().alert();
		System.out.println("popup text is:"+alt.getText());
		alt.accept();
		
		
		
		

	}

}
