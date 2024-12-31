package webHandlingSolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get parent Id or get main page id
		
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//get child page id
	Set<String>allid=	driver.getWindowHandles();
	System.out.println(allid);
	
	//how to change parent window/page to child page/window
		
		              /*
		               * Ask driver to switch based on id..
		               * if id's are not same than switch.
		               *            or
		               *    not parent id equal to child id        
		               */
		for(String childid:allid) {
			
			if(!parentid.equals(childid)) {
				driver.switchTo().window(childid);
			}
			
		}
		
		//work on child window
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("billa@123");
		Thread.sleep(2000);
		
		//difference between close() and quit()
		driver.close(); //it will close only recent active window 
		
	//	driver.quit(); // it will close all active window
		
		
		//how to change child window to parent window
		
		driver.switchTo().window(parentid);
		
		//work on parent window/page
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		

	}

}
