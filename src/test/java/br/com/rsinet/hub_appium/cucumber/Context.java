package br.com.rsinet.hub_appium.cucumber;

import java.net.MalformedURLException;

import br.com.rsinet.hub_appium.manager.DriverManager;
import br.com.rsinet.hub_appium.manager.PageObjectManager;

public class Context {
	private DriverManager driverManager;
	private PageObjectManager pageObjectManager;

	public Context() throws MalformedURLException {
		driverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(driverManager.getDriver());
	}

	public DriverManager getDriverManager() {
		return driverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
