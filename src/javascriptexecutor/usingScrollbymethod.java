package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingScrollbymethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("//img[@alt=\"Lasminingrat's 169th Birthday\"]")).click();
                break;
			}
			catch(Exception e) {
				js.executeScript("window.scrollBy(0,500);");
			}
		}
		
	}

}
