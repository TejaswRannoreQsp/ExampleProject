package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();

	}

}
