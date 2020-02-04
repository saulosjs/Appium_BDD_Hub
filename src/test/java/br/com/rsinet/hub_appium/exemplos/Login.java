package br.com.rsinet.hub_appium.exemplos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_appium.pageObject.PageHome;
import br.com.rsinet.hub_appium.pageObject.PageLogin;
import io.appium.java_client.android.AndroidDriver;

public class Login {
	private static AndroidDriver<WebElement> driver;
	private static PageHome pageHome;
	private static PageLogin pageLogin;;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "AOSP on IA Emulator");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<WebElement>(url, caps);
		pageHome = new PageHome(driver);
		pageLogin = new PageLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		pageHome.clicarMenu();
		pageHome.clicarLogin();

		pageLogin.escreverUsuario();
		pageLogin.escreverSenha();
		pageLogin.clicarBtoLogin();

		driver.quit();

	}
}
