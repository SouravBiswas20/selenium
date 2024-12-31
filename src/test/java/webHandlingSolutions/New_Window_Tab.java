package webHandlingSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Window_Tab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//create new window
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.facebook.com/");
		System.out.println(driver1.getTitle());
		
		
		//create new TAB
		WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://www.amazon.in/");
		System.out.println(driver2.getTitle());
		
		
		
		
		
		
		
		

	}

}
