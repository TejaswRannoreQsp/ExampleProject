package presentation;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchingemptybrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
