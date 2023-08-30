package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Tejaswi");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Tejaswi@123");
		

	}

}
