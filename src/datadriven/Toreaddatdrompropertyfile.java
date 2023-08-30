package datadriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toreaddatdrompropertyfile {

	public static void main(String[] args) throws IOException {
		//creation of input stream/reader
		FileInputStream fis=new FileInputStream("./TestData/testdata.properties");
		
		//creation of file type object
		Properties prop=new Properties();
		
		//read methods
		prop.load(fis);
		String testurl=(String)prop.get("url");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testurl);
		
		
		
	}

}
