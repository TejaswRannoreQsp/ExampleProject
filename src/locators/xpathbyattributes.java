package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tejaswi");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("tejaswi@123");
		driver.findElement(By.xpath("//div[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sign up\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("9916322820");
		driver.findElement(By.name("fullName")).sendKeys("Tejaswi");
		driver.findElement(By.name("username")).sendKeys("tejaswi7358");
		driver.findElement(By.name("password")).sendKeys("tejaswi@123");
		driver.findElement(By.xpath("//button[text()=\"Sign up\"]")).submit();
		

	}

}
