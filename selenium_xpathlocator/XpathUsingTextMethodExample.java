package selenium_xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsingTextMethodExample {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("D:\\Automation testing Class\\html page\\Table.html");
			Thread.sleep(3000);
			WebElement data1 = driver.findElement(By.xpath("//td[text()= 'Manual Testing']"));
			WebElement data2 = driver.findElement(By.xpath("//td[text()= 'Selenium']"));
			WebElement data3 = driver.findElement(By.xpath("//td[text()= 'Selenium+Manual']"));
			System.out.println("The text is "+data1.getText());
			System.out.println("The text is "+data2.getText());
			System.out.println("The text is "+data3.getText());
			Thread.sleep(2000);
			driver.manage().window().minimize();
			driver.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
