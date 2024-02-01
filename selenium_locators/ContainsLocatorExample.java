package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContainsLocatorExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://in.linkedin.com");
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.cssSelector("input[id*='ssi']"));
			WebElement passwordfield = driver.findElement(By.cssSelector("input[autocomplete*='rr']"));
			Thread.sleep(2000);
			emailfield.sendKeys("abc@gmail.com");
			Thread.sleep(5000);
			passwordfield.sendKeys("abc@123");
			Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
