package automatingZomato;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demowebshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Indiqube");
		driver.findElement(By.id("LastName")).sendKeys("southendcircle");
		driver.findElement(By.id("Email")).sendKeys("office125@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Office@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Office@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Office125@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Office@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement drop = driver.findElement(By.id("products-orderby"));
		Select select=new Select(drop);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement options :allOptions) {
			System.out.println(options.getText());
		}

	}

}
