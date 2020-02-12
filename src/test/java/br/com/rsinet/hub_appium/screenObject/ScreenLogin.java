package br.com.rsinet.hub_appium.screenObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ScreenLogin {
	private AndroidDriver driver;

	public ScreenLogin(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private WebElement usuario;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private WebElement senha;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private WebElement botaoLogin;

	public void escreverUsuario() {
		usuario.sendKeys("saulosjs33");
	}

	public void escreverSenha() {
		senha.sendKeys("suaMae12");
	}

	public void clicarBtoLogin() {
		botaoLogin.click();
	}

}
