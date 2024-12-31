package webHandlingSolutions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame_Demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	//	System.out.println("page title is:"+driver.getTitle());
		
		//if you want to interact with left frame , than 1st go to top frame than go left frame 
		
		//go to top frame wrt use of index no 
		driver.switchTo().frame(0);
		
		//top-->left frame(wrt id/name)
		//driver.switchTo().frame("frame-left");
	//or
		//top-->left frame (wrt WebElement)
		WebElement leftframe=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftframe);
		
		System.out.println("source code of left frame is:\n"+driver.getPageSource());	
	WebElement leftbody=driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
	System.out.println("text of left frame is:\t"+leftbody.getText());
		
		
		//left -->middle ;frame direct movement not possible
		//first return left frame to outside all frame than  1st go to top frame after that go to middle frame
		
		driver.switchTo().defaultContent();//back from left frame to top frame		
		
		//top-->middle frame(wrt id/name)
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		
		System.out.println("middle frame page source is\n"+driver.getPageSource());	
		WebElement middlebody=driver.findElement(By.id("content"));
		System.out.println("text of middle frame is:\t"+middlebody.getText());
		
		//return Middle frame--->out side of frame
		driver.switchTo().defaultContent();
		
		//outside --->top frame--->right frame(we make this same thing through one line code also)
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		System.out.println("right frame page source is :\n"+driver.getPageSource());
		
		WebElement rightbody=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']"));
		System.out.println("text of right frame is:\t"+rightbody.getText());
		
		//return right frame to out side of frame
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		//go to bottom frame wrt frame(WebElement)
		WebElement bottomframe=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomframe);
		System.out.println("bottom frame page source is:\n"+driver.getPageSource());
		System.out.println("text of bottom frame is:\t"+driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
