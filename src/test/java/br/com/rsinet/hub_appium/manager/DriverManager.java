package br.com.rsinet.hub_appium.manager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_appium.dataProvider.ConfigFileReader;
import br.com.rsinet.hub_appium.enums.DriverType;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	private AndroidDriver<WebElement> driver;
	private static DriverType driverType;

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public AndroidDriver<WebElement> getDriver() throws MalformedURLException {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private AndroidDriver<WebElement> createDriver() throws MalformedURLException {
		ConfigFileReader configFileReader = new ConfigFileReader();
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", configFileReader.getDeviceName());
		caps.setCapability("udid", configFileReader.getUdid());
		caps.setCapability("platformName", configFileReader.getPlatformName());
		caps.setCapability("platformVersion", configFileReader.getPlatformVersion());
		caps.setCapability("appPackage", configFileReader.getAppPackage());
		caps.setCapability("appActivity", configFileReader.getAppActivity());

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<WebElement>(url, caps);
		return driver;
	}

	public void fecharDriver() {
		driver.quit();
	}

}
