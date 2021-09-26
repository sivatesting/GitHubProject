package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	
	public void startup() {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
		options.addArguments("--ignore-certification-errors", "--no-sandbox" );
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		driver.get("https://developer.banka.banfico.net/");
		
		//return driver;
		
	}

	
	public void end() {
	//	driver.quit();
	}
}
