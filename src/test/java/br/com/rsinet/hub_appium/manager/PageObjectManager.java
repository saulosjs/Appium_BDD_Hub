package br.com.rsinet.hub_appium.manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_appium.screenObject.ElementoCelular;
import br.com.rsinet.hub_appium.screenObject.ScreenCadastro;
import br.com.rsinet.hub_appium.screenObject.ScreenHome;
import br.com.rsinet.hub_appium.screenObject.ScreenProdutos;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {

	private AndroidDriver<WebElement> driver;
	private ScreenHome pageHome;
	private ScreenProdutos pageProdutos;
	private ScreenCadastro pageCadastro;
	private ElementoCelular elementoCelular;
	private WebDriverWait wait;

	public PageObjectManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public ScreenHome getPageHome() {
		return (pageHome == null) ? pageHome = new ScreenHome(driver) : pageHome;
	}

	public ScreenProdutos getPageProdutos() {
		return (pageProdutos == null) ? pageProdutos = new ScreenProdutos(driver) : pageProdutos;
	}

	public ScreenCadastro getPageCadastro() {
		return (pageCadastro == null) ? pageCadastro = new ScreenCadastro(driver) : pageCadastro;
	}

	public ElementoCelular getElementoCelular() {
		return (elementoCelular == null) ? elementoCelular = new ElementoCelular(driver) : elementoCelular;
	}

	public WebDriverWait getWait() {
		return (wait == null) ? wait = new WebDriverWait(driver, 10) : wait;
	}

}
