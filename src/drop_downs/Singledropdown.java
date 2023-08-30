package drop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singledropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/OneDrive/Documents/selenium-online-section/hotelmenu.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("Empire"));
		Select s=new Select(element);
//		s.selectByIndex(1);
//		Thread.sleep(2000);
//		s.selectByValue("k");
//		Thread.sleep(2000);
//		s.selectByVisibleText("aamras");
		boolean b = s.isMultiple();
		if(b) {
			System.out.println("this is multiple drop-down");
		}else {
			System.out.println("It is not");
		}
		

	}

}
