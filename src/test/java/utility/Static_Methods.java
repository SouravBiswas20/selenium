package utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Static_Methods {
	
	
	//Select based Drop Down reusable method/function
	
	public static void selectbaseddropdown(WebElement ele,String obj)
	{
	
	Select sc = new Select(ele);

	System.out.println("is fdd capable to select multiple selection\t:" + sc.isMultiple());
	List<WebElement> dlist = sc.getOptions();
	System.out.println("total no of element:\t" + dlist.size());
	for (WebElement i : dlist) {
		System.out.println(i.getText());
		
		if(i.getText().contains(obj)) {   
			i.click();
		//	break;
		}
	}
	
	}
	
	
	//WebDriverWait class reusable method/function
	
	
	public static WebElement waitforPresenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait obj1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	
	
	public static WebElement waitforElementClickable(WebDriver driver,By loc)
	{
		WebDriverWait obj2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj2.until(ExpectedConditions.elementToBeClickable(loc));	
	}
	
	
	
	public static WebElement waitforVisibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait obj = new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.visibilityOfElementLocated(loc));	
	}
	
	
	
	
	public static Boolean waitforUrlContains(WebDriver driver,String url)
	{
		WebDriverWait obj3=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj3.until(ExpectedConditions.urlContains(url));	
	}
	
	
	
	public static Boolean waitforTitleContains(WebDriver driver,String title)
	{
		WebDriverWait obj4=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj4.until(ExpectedConditions.titleContains(title));
		
	}
	
	
	
	
	//java script reusable method/function
	
	
	public static void scrollDown(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
