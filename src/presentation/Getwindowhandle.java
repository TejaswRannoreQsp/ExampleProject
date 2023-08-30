package presentation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/MultipleWindow%20(1)%20(1).html");
		System.out.println(driver.getWindowHandle());
	}

}
