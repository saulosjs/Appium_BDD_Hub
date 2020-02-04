package br.com.rsinet.hub_appium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PageProdutos {
	private AndroidDriver<WebElement> driver;

	public PageProdutos(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "android.widget.TextView")
	private By webView;

	@FindBy(how = How.ID, using = "resource-id")
	private By title;

	public String getTitle() {
		return driver.findElement(title).getText();
	}

//	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[5]/android.widget.TextView[1]")
//	private WebElement hpPavilionX360;
//
//	public void clickHpPavilionX360() {
//		hpPavilionX360.click();
//	}
//
//	public Boolean getHp360() {
//		return hpPavilionX360.isDisplayed();
//	}

}
