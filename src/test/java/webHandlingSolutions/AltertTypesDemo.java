package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltertTypesDemo {

	// Alerts are basically an interface between the current web page and UI.
    //Alert is interface in selenium..
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("*********************************************************");

		// alert Type 1: simple alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		// alert appears
		Thread.sleep(2000);

		// alert handling
		Alert alt = driver.switchTo().alert();
		System.out.println("text of the alert is:\t" + alt.getText());

		// OK press on alert pop-up
		alt.accept();

		// result of alert
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());

		System.out.println("*************************************************************************");
		// alert Type 2: confirmation alert

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		// alert appears
		Thread.sleep(2000);

		// alert handling
		Alert alt1 = driver.switchTo().alert();
		System.out.println("text of the alert is:\t" + alt1.getText());

		// cancel press on alert pop-up
		alt1.dismiss();

		// result of alert
		WebElement result1 = driver.findElement(By.id("result"));
		System.out.println(result1.getText());

		System.out.println("****************************************************************************");
		// alert type 3: prompt alert

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		// alert handling
		Alert alt2 = driver.switchTo().alert();
		System.out.println("test of the alert is:\t" + alt2.getText());

		// write some thing on alert pop-up
		alt2.sendKeys("Hi Billa");
		alt2.accept();

		// result of alert
		WebElement result2 = driver.findElement(By.id("result"));
		System.out.println(result2.getText());

	}

}
