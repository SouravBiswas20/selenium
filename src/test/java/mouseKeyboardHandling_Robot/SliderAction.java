package mouseKeyboardHandling_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(ele);

		WebElement slider = driver.findElement(By.className("ui-slider-handle"));

		Actions ac = new Actions(driver);
		
//Type:1--->(this below method discover by me accidentally)
		ac.dragAndDropBy(slider,300,0).build().perform();

		System.out.println("slide is succesful on 1st condition");

		
		Thread.sleep(2000);
		
		
//Type:2--->
		ac.clickAndHold(slider).moveToElement(slider,100,0).build().perform();
		
		System.out.println("slide is succesful on 2nd condition");
		
		
		
		
		
	}

}
