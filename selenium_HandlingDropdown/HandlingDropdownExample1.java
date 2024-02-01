package selenium_HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownExample1 {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.saucedemo.com");
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.id("user-name"));
			WebElement passwordfield = driver.findElement(By.id("password"));
			WebElement loginBtn = driver.findElement(By.id("login-button"));
			Thread.sleep(2000);
			emailfield.sendKeys("standard_user");
			Thread.sleep(5000);
			passwordfield.sendKeys("secret_sauce");
			Thread.sleep(5000);
			loginBtn.click();
			Thread.sleep(2000);
			WebElement dropdown = driver.findElement(By.className("product_sort_container"));
			Select select = new Select(dropdown);
			Thread.sleep(3000);
			select.selectByIndex(3);
			Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.close();		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
