package selenium_xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsingAndOrbetweenOperatorWithAttributesExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.navigate().to("https://www.instagram.com");
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.xpath("//input[@aria-required='true'and @autocapitalize='off']"));
			WebElement passwordfield = driver.findElement(By.xpath("//input[@class='_aa4b'or @aria-label='Password']"));
			emailfield.sendKeys("abc@gmail.com");
			Thread.sleep(3000);
			passwordfield.sendKeys("abc123");
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.quit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
