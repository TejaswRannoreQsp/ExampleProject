package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//img[@alt=\"MUMBAI\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Bholaa\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()=\"Book tickets\"])[1]")).click();

	}

}
