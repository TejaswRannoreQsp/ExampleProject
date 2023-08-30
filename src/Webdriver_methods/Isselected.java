package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.linkText("Register"));
		System.out.println(register.isDisplayed());
		System.out.println("***************");
		System.out.println(register.isEnabled());
		System.out.println("***************");
		System.out.println(register.isSelected());
		

	}

}
