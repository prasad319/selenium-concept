package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinktextLocatorExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement forgottenpasswordlink= driver.findElement(By.linkText("Forgotten password?"));
			Thread.sleep(3000);
			forgottenpasswordlink.click();
			Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
