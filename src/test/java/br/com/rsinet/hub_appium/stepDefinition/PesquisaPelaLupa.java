package br.com.rsinet.hub_appium.stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_appium.pageObject.ElementoCelular;
import br.com.rsinet.hub_appium.pageObject.PageHome;
import br.com.rsinet.hub_appium.pageObject.PageProdutos;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaPelaLupa {
	private PageHome pageHome;
	private PageProdutos pageProdutos;
	private ElementoCelular elementoCelular;
	private AndroidDriver<WebElement> driver;

	@Dado("^que o usuario esteja na pagina principal do aplicativo\\.$")
	public void que_o_usuario_esteja_na_pagina_principal_do_aplicativo() throws MalformedURLException {
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
		pageProdutos = new PageProdutos(driver);
		elementoCelular = new ElementoCelular(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Quando("^o usuario pesquisar algum prduto na lupa$")
	public void o_usuario_pesquisar_algum_prduto_na_lupa() {
		pageHome.escreverNaLupa();
		pageHome.clickNaLupa();
	}

	@Quando("^escolher o produto$")
	public void escolher_o_produto() {
//		pageProdutos.clickHpPavilionX360();
		String mano = pageProdutos.getTitle();
		System.out.println(mano);

	}

	@Entao("^verificar as informacoes do produto$")
	public void verificar_as_informacoes_do_produto() {

	}

}
