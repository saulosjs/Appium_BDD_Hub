package br.com.rsinet.hub_appium.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import br.com.rsinet.hub_appium.cucumber.Context;
import br.com.rsinet.hub_appium.pageObject.ElementoCelular;
import br.com.rsinet.hub_appium.pageObject.PageHome;
import br.com.rsinet.hub_appium.pageObject.PageProdutos;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaLupa {
	private PageHome pageHome;
	private PageProdutos pageProdutos;
	private ElementoCelular elementoCelular;
	private Context contexto;

	public PesquisaPelaLupa(Context context) {
		contexto = context;
		pageHome = contexto.getPageObjectManager().getPageHome();
		pageProdutos = contexto.getPageObjectManager().getPageProdutos();
		elementoCelular = contexto.getPageObjectManager().getElementoCelular();
	}

	@Dado("^que o usuario esteja na pagina principal do aplicativo\\.$")
	public void que_o_usuario_esteja_na_pagina_principal_do_aplicativo() throws MalformedURLException {
		contexto.getDriverManager().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Quando("^o usuario pesquisar algum prduto na lupa$")
	public void o_usuario_pesquisar_algum_prduto_na_lupa() {
		pageHome.escreverNaLupa();
		pageHome.clickNaLupa();
	}

	@Quando("^escolher o produto$")
	public void escolher_o_produto() {
		elementoCelular.encontrarProduto(pageProdutos);
		pageProdutos.clickHpPavilionX360();

	}

	@Entao("^verificar as informacoes do produto$")
	public void verificar_as_informacoes_do_produto() throws InterruptedException {
		Assert.assertEquals(pageProdutos.getExpectativa(), pageProdutos.getAtual());
	}

	@Quando("^o usuario pesquisar algum prduto que nao existe na lupa$")
	public void o_usuario_pesquisar_algum_prduto_que_nao_existe_na_lupa() {
		pageHome.escreverProdutoNaoExistenteNaLupa();
		pageHome.clickNaLupa();
	}

	@Entao("^verifica a mensagem de erro$")
	public void verifica_a_mensagem_de_erro() {
		assertEquals(pageProdutos.getExpectativaFalha(), pageProdutos.getResutadoErro());
	}

}
