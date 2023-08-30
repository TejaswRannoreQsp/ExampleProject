
package actionclass;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("tejaswisrao1306@gmail.com");
		driver.findElement(By.id("login")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		driver.findElement(By.name("password")).sendKeys("Tejaswi@123");
	    driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()=\"online selenium\"]")).click();
	    WebElement source = driver.findElement(By.xpath("//span[text()=\"online\"]"));
	    WebElement destination = driver.findElement(By.xpath("//h2[text()=\"training\"]/../..//span[text()=\"Add a card\"]"));
	    Actions action=new Actions(driver);
	    action.dragAndDrop(source, destination).perform();

	}

}
