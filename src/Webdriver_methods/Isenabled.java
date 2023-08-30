package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/OneDrive/Documents/selenium-online-section/enabled.html");
		WebElement ele = driver.findElement(By.id("a1"));
		boolean b = ele.isEnabled();
		if(b) {
			System.out.println("text box is displayed");
		}
		else
			System.out.println("text box is not displayed");
			

	}

}
