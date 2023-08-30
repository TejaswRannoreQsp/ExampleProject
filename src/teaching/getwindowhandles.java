package teaching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		String window = driver.getWindowHandle();
		
			System.out.println(window);
			driver.close();
		}
		
	}


