package teaching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultiplepop_ups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow%20(1)%20(1).html");
		driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
		Thread.sleep(2000);
	    Set<String> allwindowid = driver.getWindowHandles();
	    for(String windowid:allwindowid) {
	    	System.out.println(windowid);
	    	
	    }
		driver.close();
	

	}

}
