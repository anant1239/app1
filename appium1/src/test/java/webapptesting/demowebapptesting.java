package webapptesting;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
public class demowebapptesting extends capabilities{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		driver = capability();
		driver.get("https://www.espncricinfo.com/");
		
			
	}
	
	@Test
	public void Testcase()
	
	{
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.partialLinkText("LIVE - Chahar, Prasidh, Axar dent Zimbabwe"));
		
		  js.executeScript("arguments[0].scrollIntoView()",ele);
		
	}
	@AfterTest
	
	public void at()
	
	{
		driver.close();
		
	}
		
		
	

}
