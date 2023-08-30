package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvaluemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement element = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("text-align"));
		System.out.println(element.getTagName());
		System.out.println(element.getText());
		System.out.println(element.getAttribute("name"));
		System.out.println(element.getLocation());
	}

}
