package webHandlingSolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//JavaScriptExecutor is a interface in Selenium to handle JavaScript event...
		//we don't create object of  any Interface.
		
		
		/*java automatically support only  down casting
		 * but if you want top casting,than we use
		 * casting operator....
		 * in  below statement we do top casting
		*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//scroll down of web page wrt hard core data
		js.executeScript("window.scrollTo(0,6000)");
		System.out.println("Web page scroll down wrt hard core data");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(6000,0)");
		System.out.println("Web page scroll up wrt hard core data");
		
		Thread.sleep(2000);
		
		//scroll till end/height of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("scroll till end of the web page");
		
		Thread.sleep(2000);
		
		//scroll up from the end of web page
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		System.out.println("scroll up from end of web page to top of the web page");
		
		Thread.sleep(2000);
		
		//scrolled till the selected element on web page

	WebElement ele=	driver.findElement(By.className("a-color-base"));
	js.executeScript("arguments[0].scrollIntoView()",ele);
	System.out.println("page scrolled till the selected Element on webpage");
		
		
		//to create new alert
	js.executeScript("alert('I am javascript alert')");
		System.out.println("java script alert create succesfully");
		
		
	}

}
