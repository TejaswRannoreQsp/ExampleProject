package youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstvideo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.name("search_query"));
		search.click();
		
		search.sendKeys("bombe bombe song kranti movie");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//*[text()='Kranti | Bombe Bombe Kannada Song | Darshan, Rachitha Ram | V Harikrishna | Shylaja Nag, B Suresha'])[1]")).click();
		
		

	}

}
