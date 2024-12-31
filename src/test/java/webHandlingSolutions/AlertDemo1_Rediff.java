package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1_Rediff {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("sourav");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
	Alert alt=	driver.switchTo().alert();
	
	alt.accept();
	
	driver.findElement(By.id("password")).sendKeys("123456");
	
	
	driver.findElement(By.name("proceed")).click();
			

	}

}
