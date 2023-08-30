package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
//		String titleofthepage = driver.getTitle();
//		System.out.println(titleofthepage);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
