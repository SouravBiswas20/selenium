package webHandlingSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook_10_Different_TAB {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
		//open Face book in 10 different tab
		for(int i=1;i<=10;i++) {
			
			WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
			driver1.get("https://www.facebook.com/");
		 System.out.println(driver1.getTitle());
		}
		
		//open amazon in 10 different window
		
		for(int i=0;i<10;i++) {
			
			WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
			driver1.get("https://www.amazon.in/");
			System.out.println(driver1.getTitle());
		}
		
		
		

	}

}
