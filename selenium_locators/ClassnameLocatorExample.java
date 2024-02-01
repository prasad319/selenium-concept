package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassnameLocatorExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			WebElement emailfield = driver.findElement(By.className("inputtext"));
			WebElement passwordfield = driver.findElement(By.className("_9npi"));
			Thread.sleep(2000);
			emailfield.sendKeys("abc@123");
			Thread.sleep(5000);
			passwordfield.sendKeys("abc@123");
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.close();	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}

}
