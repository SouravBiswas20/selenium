package own_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Static_Methods;

public class Select_DD_Facebook_utility {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		// driver.findElement(By.xpath("(//a)[3]")).click();//using xpath
		driver.findElement(By.linkText("Create new account")).click();

		WebElement fdd = driver.findElement(By.id("day"));// fdd=first drop down

		WebElement sdd = driver.findElement(By.id("month"));// sdd=second drop down

		WebElement tdd = driver.findElement(By.id("year"));// tdd=third drop down
		
		
		
		
		Static_Methods.selectbaseddropdown(fdd,"20");
		Static_Methods.selectbaseddropdown(sdd,"May");
		Static_Methods.selectbaseddropdown(tdd,"1993");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		Select sc = new Select(fdd);

		System.out.println("is fdd capable to select multiple selection\t:" + sc.isMultiple());
		List<WebElement> dlist = sc.getOptions();
		System.out.println("total no of days:\t" + dlist.size());
		for (WebElement i : dlist) {
			System.out.println(i.getText());
			
			if(i.getText().contains("20")) {   //select 20/05/1993 on dropDown
				i.click();
			//	break;
			}
		}

		Select sc1 = new Select(sdd);
		System.out.println("is sdd capable to select multiple selection\t:" + sc1.isMultiple());

		List<WebElement> mlist = sc1.getOptions();

		System.out.println("total no of month is:\t"+mlist.size());
		for(WebElement i:mlist) {
			System.out.println(i.getText());
			
			if(i.getText().contains("May")) {   //select 20/05/1993 on dropDown
				i.click();
			//	break;
			}
		}
		
		Select sc2=new Select(tdd);
		System.out.println("is year capable to select multiple selection\t"+sc2.isMultiple());
		
	List<WebElement>ylist=	sc2.getOptions();
	
	System.out.println("total no of year is:\t"+ylist.size());
		
		for(WebElement i:ylist) {
			System.out.println(i.getText());
			if(i.getText().contains("1993")) {  //select 20/05/1993 on dropDown
				i.click();
			//	break;
			}
		}
		
		//select 20/05/1993 on dropDown
		
	/*	
		sc.selectByVisibleText("20");
		sc1.selectByIndex(4);
		sc2.selectByValue("1993");
		*/
		//or
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
