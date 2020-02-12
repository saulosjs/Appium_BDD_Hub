package br.com.rsinet.hub_appium.screenObject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ElementoCelular {
	private AndroidDriver driver;
	private TouchAction moverTela;

	public ElementoCelular(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		moverTela = new TouchAction(driver);
	}

	public void clickEnter() {
		moverTela.tap(PointOption.point(932, 1691)).perform();
	}

	public void arrastarTelaParaBaixo() {
		moverTela.press(PointOption.point(815, 1623)).moveTo(PointOption.point(905, 300)).release().perform();
	}

	public void setaVoltarGeral() {
		moverTela.tap(PointOption.point(982, 1687)).perform();
	}

	public void esolherPreco() {
		moverTela.press(PointOption.point(49, 437)).moveTo(PointOption.point(962, 437)).release().perform();
	}

	public void procuraTexto(String texto) throws Exception {
		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ texto + "\").instance(0))")
				.click();
	}

}
