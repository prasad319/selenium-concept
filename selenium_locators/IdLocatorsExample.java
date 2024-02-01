package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdLocatorsExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.id("email"));
			WebElement passwordfield = driver.findElement(By.id("pass"));
			Thread.sleep(2000);
			emailfield.sendKeys("abc@gmail.com");
			Thread.sleep(5000);
			passwordfield.sendKeys("abc@123");
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
}