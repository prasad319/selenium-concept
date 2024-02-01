package selenium_HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownExample2 {

	public static void main(String[] args) {
	try {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://ultimateqa.com");
		Thread.sleep(2000);
		WebElement learningbtn = driver.findElement(By.linkText("Learning"));
		Select select = new Select(learningbtn);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
			
	}

}
