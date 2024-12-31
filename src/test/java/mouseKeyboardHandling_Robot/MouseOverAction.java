package mouseKeyboardHandling_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		driver.manage().window().maximize();//to get full screen size window
		
		driver.switchTo().frame("iframeResult");//img present in side frame ...so at first manage frame 
		
		WebElement img=driver.findElement(By.xpath("//img[@src='smiley.gif']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(img).build().perform();
		System.out.println(" Big image appears!!!! ");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
