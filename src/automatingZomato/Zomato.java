package automatingZomato;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement search = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("women kurtas", Keys.ENTER);
		driver.findElement(By.xpath("//img[@title='Stylum Women Purple Geometric Printed Kurta with Dupatta']"))
				.click();

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,800);");
			}
		}
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("9916322820");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();

	}

}
