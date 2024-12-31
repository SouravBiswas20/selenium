package own_Practice;

import java.time.Duration;
//import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Headless_Testing {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
	//	options.addArguments("--disable-gpu");
	//	options.addArguments("--window-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		WebElement tolist = driver.findElement(By.xpath("Xpath=//tabindex[@attribute='-1']"));
		tolist.click();
		tolist.sendKeys("kgp");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));

		System.out.println("total no of element on to DD:\t" + list.size());

		for (WebElement i : list) {
			System.out.println(i.getText());

			if (i.getText().contains("Kapadvanj")) {
				i.click();
				break;
			}

		}

	}

}
