package selenium_xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsingTextMethodExample2 {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.navigate().to("D:\\Automation testing Class\\html page\\table 2.html");
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.xpath("//td[text()='Rohit Sharma']"));
			WebElement role = driver.findElement(By.xpath("//td[text()='Batter']"));
			WebElement age = driver.findElement(By.xpath("//td[text()='36']"));
			System.out.println("The name is "+name.getText());
			System.out.println("Role is "+role.getText());
			System.out.println("Age is "+age.getText());
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
