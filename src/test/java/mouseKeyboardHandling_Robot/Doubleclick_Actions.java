package mouseKeyboardHandling_Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement dcbtn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions ac=new Actions(driver);//create actions class and pass driver in action class object constructor
		
		ac.doubleClick(dcbtn).build().perform();//perform double click on web element
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println("text of alert pop-up is:\t"+alt.getText());
		
		Thread.sleep(2000);
		alt.accept();
		
		
		
		
		

	}

}
