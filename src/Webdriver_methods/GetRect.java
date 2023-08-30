package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement emailtextfield = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
		WebElement passwordtextfield = driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
		Rectangle email = emailtextfield.getRect();
		Rectangle password = passwordtextfield.getRect();
		
		if(email.getX()==password.getX()) {
			System.out.println("both alignment is same");
		}else {
			System.out.println("it is different");
		}
		

	}

}
