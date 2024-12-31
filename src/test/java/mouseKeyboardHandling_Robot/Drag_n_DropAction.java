package mouseKeyboardHandling_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_DropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/#default");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement ele1=driver.findElement(By.id("draggable"));
		
	  WebElement ele2=	driver.findElement(By.id("droppable"));
	  
	  Actions ac=new Actions(driver);
	

	  //Type:1--->solution process
	  ac.dragAndDrop(ele1,ele2).build().perform();
	  
	  System.out.println("element movement succesful!!!!");
		
		
	  //Type:2---->solution process
	  ac.clickAndHold(ele2).moveToElement(ele1).release().build().perform();
		
	  System.out.println("element back succesful!!!!");
		
		
		
		
		
		
		
		
		
		

	}

}
