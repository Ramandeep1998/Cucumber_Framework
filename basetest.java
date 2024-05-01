package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basetest {
	
	public  WebDriver driver ;

//	this.driver=driver;
	
	@BeforeClass
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver","E:\\stock course\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		System.out.println("setup executed");
	}

	@AfterClass
	public void teardown() {
//			driver.quit();
		System.out.println("teardown executed");
	}
}
