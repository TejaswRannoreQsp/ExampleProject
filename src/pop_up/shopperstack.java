package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopperstack {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.get("https://www.shoppersstack.com/");
		for(;;) {
			try {
				driver.findElement(By.linkText("Swagger Documentation")).click();
				break;
			}
				catch(Exception e) {
					action.sendKeys(Keys.PAGE_DOWN).perform();
					Thread.sleep(2000);
				}
			}
		Thread.sleep(2000);
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		Thread.sleep(2000);
		popup.accept();
		Thread.sleep(2000);
		popup.sendKeys("admin");
		Thread.sleep(2000);
		popup.accept();
		Thread.sleep(2000);
		popup.sendKeys("admin");
		Thread.sleep(2000);
		popup.accept();
		Thread.sleep(2000);
		System.out.println(popup.getText());
		popup.accept();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		

	}

}
