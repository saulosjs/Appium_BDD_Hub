package br.com.rsinet.hub_appium.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PageHome {
	private AndroidDriver driver;

	public PageHome(AndroidDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;

	@FindBy(how = How.XPATH, using = "//android.support.v4.widget.DrawerLayout[@content-desc=\"Main Menu\"]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView\r\n")
	private WebElement login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement cadastro;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement imagemLupa;

	public void clicarMenu() {
		menu.click();
	}

	public void clicarLogin() {
		login.click();
	}

	public void clicarCadastro() {
		cadastro.click();
	}

	public void escreverNaLupa() {
		lupa.sendKeys("hp");
	}

	public void clickNaLupa() {
		imagemLupa.click();
	}

}
