package br.com.rsinet.hub_appium.manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_appium.pageObject.ElementoCelular;
import br.com.rsinet.hub_appium.pageObject.PageCadastro;
import br.com.rsinet.hub_appium.pageObject.PageHome;
import br.com.rsinet.hub_appium.pageObject.PageProdutos;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {

	private AndroidDriver<WebElement> driver;
	private PageHome pageHome;
	private PageProdutos pageProdutos;
	private PageCadastro pageCadastro;
	private ElementoCelular elementoCelular;
	private WebDriverWait wait;

	public PageObjectManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public PageHome getPageHome() {
		return (pageHome == null) ? pageHome = new PageHome(driver) : pageHome;
	}

	public PageProdutos getPageProdutos() {
		return (pageProdutos == null) ? pageProdutos = new PageProdutos(driver) : pageProdutos;
	}

	public PageCadastro getPageCadastro() {
		return (pageCadastro == null) ? pageCadastro = new PageCadastro(driver) : pageCadastro;
	}

	public ElementoCelular getElementoCelular() {
		return (elementoCelular == null) ? elementoCelular = new ElementoCelular(driver) : elementoCelular;
	}

	public WebDriverWait getWait() {
		return (wait == null) ? wait = new WebDriverWait(driver, 10) : wait;
	}

}
