package br.com.rsinet.hub_appium.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class PageProdutos {
	private AndroidDriver<WebElement> driver;
	private String expectativa;
	private WebDriverWait wait;

	public PageProdutos(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewProduct")
	private WebElement esperarprodutos;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.View[3]")
	private WebElement roxo;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement blueTooth;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.ImageView")
	private WebElement hp2310INEAR;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[6]/android.widget.TextView[1]")
	private WebElement hpPavilionX360;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement atual;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement resutadoErro;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private WebElement filtro;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private WebElement headshetH2310;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement byPrice;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement apply;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement compatibility;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement opcao2;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement resul;

	public Boolean getHp2310INEAR() {
		return hp2310INEAR.isDisplayed();
	}

	public void clickHpPavilionX360() {
		hpPavilionX360.click();
	}

	public Boolean getHp360() {
		return hpPavilionX360.isDisplayed();
	}

	public String getTexto() {
		return hpPavilionX360.getText();
	}

	public String getExpectativa() {
		return expectativa = "HP PAVILION X360 - 11T TOUCH LAPTOP";
	}

	public String getExpectativaFalha() {
		return expectativa = "- No results for \"corinthians\" -";
	}

	public String getAtual() {
		return atual.getText();
	}

	public String getResutadoErro() {
		return resutadoErro.getText();
	}

	public void clickFiltro() {
		filtro.click();
	}

	public void clickHeadsetH2130() {
		headshetH2310.click();
	}

	public String expectativaPesquisaHome() {
		return expectativa = "HP H2310 IN-EAR HEADSET";
	}

	public void clickPreco() {
		byPrice.click();
	}

	public void clickApply() {
		apply.click();
	}

	public void clickCompatipility() {
		compatibility.click();
	}

	public void clickOpcao2() {
		opcao2.click();
	}

	public String expectativaHome() {
		return expectativa = "- No results -";
	}

	public String getAtualHome() {
		return resul.getText();
	}

	public void clickBlueTooth() {
		blueTooth.click();
	}

	public void clickRoxo() {
		roxo.click();
	}

	public void esperarProduto() {
		wait.until(ExpectedConditions.elementToBeClickable(esperarprodutos));
	}

}
