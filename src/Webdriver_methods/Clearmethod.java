package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Tejaswi");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).clear();
	

	}

}
