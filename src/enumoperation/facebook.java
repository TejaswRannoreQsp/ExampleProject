package enumoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys("Tejaswi");
		element.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		element.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.name("lastname"));
        element1.sendKeys(Keys.CONTROL+"v");
	}

}
