package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow%20(1)%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
		//String parentid = driver.getWindowHandle();
		//Set<String> childwindow = driver.getWindowHandles();
		driver.close();
		
		
	}

}
