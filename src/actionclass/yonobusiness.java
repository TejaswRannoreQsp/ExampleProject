package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yonobusiness {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("Testing@123");
		
		Actions action=new Actions(driver);
		WebElement showicon = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
        action.clickAndHold(showicon).perform();
	}

}
