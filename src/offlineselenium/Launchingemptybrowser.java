package offlineselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingemptybrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

	}

}
