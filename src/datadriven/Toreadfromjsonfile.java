package datadriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toreadfromjsonfile {

	public static void main(String[] args) throws IOException, ParseException {
		//file reader
		FileReader fr=new FileReader("./TestData/testdata.json");
		
		//Object of file type
		JSONParser parser=new JSONParser();
		JSONObject json=(JSONObject)parser.parse(fr);
		
		//read methods
		String testurl=(String)json.get("url");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testurl);
		
		System.out.println(json.get("carname"));
		System.out.println(json.get("price"));

	}

}
