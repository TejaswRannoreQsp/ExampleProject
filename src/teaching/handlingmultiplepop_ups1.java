package teaching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultiplepop_ups1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow%20(1)%20(1).html");
		driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
		Thread.sleep(2000);
		String parentid = driver.getWindowHandle();
		Set<String> windowid = driver.getWindowHandles();
		windowid.remove(parentid);
		System.out.println(windowid.size());
		for(String window:windowid) {
			
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Barbeque")) {
			//	System.out.println(window);
			driver.close();
			}
		}
		

	}

}
