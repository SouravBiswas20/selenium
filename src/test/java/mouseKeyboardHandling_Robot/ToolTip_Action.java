package mouseKeyboardHandling_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_Action {

	public static void main(String[] args) {
		/*
		 * Tooltips can be attached to any element. When you hover the element with your
		 * mouse, the title attribute is displayed in a little box next to the element,
		 * just like a native tooltip.
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		WebElement box=driver.findElement(By.id("age"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(box).build().perform();
		
	WebElement text=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));
		
		System.out.println("massege of tooltip is:\t"+text.getText());
		
		
		
		
		
	}

}
