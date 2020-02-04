package br.com.rsinet.hub_appium.stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_appium.cucumber.Context;
import br.com.rsinet.hub_appium.pageObject.ElementoCelular;
import br.com.rsinet.hub_appium.pageObject.PageCadastro;
import br.com.rsinet.hub_appium.pageObject.PageHome;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Cadastro {
	private Context contexto;
	private static PageHome pageHome;
	private static PageCadastro pageCadastro;
	private static ElementoCelular elementoCelular;
	private WebDriverWait wait;

	public Cadastro(Context context) {
		contexto = context;
		pageHome = contexto.getPageObjectManager().getPageHome();
		pageCadastro = contexto.getPageObjectManager().getPageCadastro();
		elementoCelular = contexto.getPageObjectManager().getElementoCelular();
		wait = contexto.getPageObjectManager().getWait();

	}

	@Dado("^que o usuario esteja na pagina principal do aplicativo$")
	public void que_o_usuario_esteja_na_pagina_principal_do_aplicativo() throws MalformedURLException {
		contexto.getDriverManager().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Quando("^o usuario entrar na pagina de cadastro$")
	public void o_usuario_entrar_na_pagina_de_cadastro() {
		pageHome.clicarMenu();
		pageHome.clicarLogin();
		pageHome.clicarCadastro();
	}

	@Quando("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws InterruptedException, MalformedURLException {
		pageCadastro.escreverUsuario();
		pageCadastro.escreverEmail();
		pageCadastro.escreverSenha();
		pageCadastro.escreverConfirmarSenha();
		pageCadastro.escreverPrimeiroNome();
		pageCadastro.escreverSobreNome();
		pageCadastro.escreverTelefone();
		pageCadastro.clickTelefone();
		elementoCelular.clickEnter();
		pageCadastro.clicarPais();

		wait.until(ExpectedConditions.visibilityOf(contexto.getDriverManager().getDriver().findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"))));
		elementoCelular.arrastarTelaParaBaixo();
		elementoCelular.arrastarTelaParaBaixo();
		pageCadastro.escolherPais();

		pageCadastro.clickEstado();
		pageCadastro.escreverEstado();
		elementoCelular.clickEnter();
		pageCadastro.escreverEndereco();
		elementoCelular.clickEnter();
		pageCadastro.escreverCidade();
		pageCadastro.escreverZip();
		elementoCelular.setaVoltarGeral();
		elementoCelular.arrastarTelaParaBaixo();
	}

	@Quando("^cricar no botao de registra$")
	public void cricar_no_botao_de_registra() {
		pageCadastro.clickBotaoRegistrar();
	}

	@Entao("^verifica se criou o usuario$")
	public void verifica_se_criou_o_usuario() throws InterruptedException {
		Thread.sleep(2000);
		pageHome.clicarMenu();
		Assert.assertEquals(pageCadastro.getExpectativa(), pageCadastro.getAtual());
	}

	@Entao("^verifica que o usuario nao foi criado$")
	public void verifica_que_o_usuario_nao_foi_criado() {
		pageHome.clicarMenu();
		Assert.assertEquals(pageCadastro.getExpectativaNaFalha(), pageCadastro.getAtual());
	}

}
