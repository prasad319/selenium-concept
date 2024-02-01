package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagandClassnameandAttributesLocatorExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.cssSelector("input.inputtext[aria-label='Email address or phone number']"));
			WebElement passwordfield = driver.findElement(By.cssSelector("input._9npi[aria-label='Password']"));
			Thread.sleep(2000);
			emailfield.sendKeys("abc@gmail.com");
			Thread.sleep(5000);
			passwordfield.sendKeys("abc@123");
			Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.close();			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
