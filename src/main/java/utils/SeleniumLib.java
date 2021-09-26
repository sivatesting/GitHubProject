package utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLib {

	public WebDriver driver;
	public String sUrl,sHubUrl,sHubPort;
	public Properties prop;
	
	public SeleniumLib(WebDriver driver) {
		this.driver = driver;
	}


	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			String x = ""+ele;
			
		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void click(WebElement ele) {
		String text = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			
		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		} 
	}

	

	public String getText(WebElement ele) {	
		String bReturn = "";
		try {
			bReturn = ele.getText();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
		return bReturn;
	}

	public String getTitle() {		
		String bReturn = "";
		try {
			bReturn =  driver.getTitle();
		} catch (WebDriverException e) {
			e.printStackTrace();
		} 
		return bReturn;
	}

	public String getAttribute(WebElement ele, String attribute) {		
		String bReturn = "";
		try {
			bReturn=  ele.getAttribute(attribute);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} 
		return bReturn;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
		
		} catch (WebDriverException e) {
			e.printStackTrace();
		}

	}

	

	



	

	


	

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {
			
		} catch (WebDriverException e) {
		
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			
		} catch (NoSuchFrameException e) {
			
		} catch (WebDriverException e) {
			
		} 
	}

	public void acceptAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();
		
		} catch (NoAlertPresentException e) {
		
		} catch (WebDriverException e) {
			
		}  
	}

	public void dismissAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();
	
		} catch (NoAlertPresentException e) {
		
		} catch (WebDriverException e) {
			
		} 

	}

	public String getAlertText() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			
		} catch (WebDriverException e) {
			
		} 
		return text;
	}


	public void closeBrowser() {
		try {
			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




}
