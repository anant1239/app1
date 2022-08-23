package webapptesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities {
	
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		 DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Oneplus");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		// cap.setCapability(MobileCapabilityType.)
		 cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"E://chromedriver.exe" );
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
		// driver.get("http://www.google.com");
		// System.out.println(driver.getTitle());
		 
		 return driver;
	}

	
}
