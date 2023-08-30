package teaching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.switchTo().frame(3);
		WebElement src = driver.findElement(By.xpath("//h5[text()=\"High Tatras\"]"));
		WebElement dest = driver.findElement(By.id("trash"));
		driver.switchTo().parentFrame();
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).perform();

	}

}
