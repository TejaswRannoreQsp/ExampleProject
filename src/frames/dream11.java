package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.dream11.com/");
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}

	}


