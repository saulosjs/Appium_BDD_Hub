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

public class PesquisaPelaHome {
	private PageHome home;
	private PageProdutos produtos;
	private ElementoCelular celular;
	private Context contexto;

	public PesquisaPelaHome(Context context) {
		contexto = context;
		home = contexto.getPageObjectManager().getPageHome();
		produtos = contexto.getPageObjectManager().getPageProdutos();
		celular = contexto.getPageObjectManager().getElementoCelular();
	}

	@Dado("^que o usuario esteja na pagina principal do aplicativo advantage$")
	public void que_o_usuario_esteja_na_pagina_principal_do_aplicativo_advantage() throws MalformedURLException {
		contexto.getDriverManager().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Quando("^o usuario clicar no tipo do produto$")
	public void o_usuario_clicar_no_tipo_do_produto() {
		home.clickHeadphones();
	}

	@Quando("^escolher um dos produtos$")
	public void escolher_um_dos_produtos() {
		produtos.clickHeadsetH2130();
	}

	@Entao("^aparece as informacoes do produto$")
	public void aparece_as_informacoes_do_produto() {
		Assert.assertEquals(produtos.expectativaPesquisaHome(), produtos.getAtual());
	}

	@Quando("^colocar as especificacao no fildro$")
	public void colocar_as_especificacao_no_fildro() throws Exception {
		Thread.sleep(2000);
		produtos.clickFiltro();
		celular.procuraTexto("BY CONNECTOR");
		produtos.clickBlueTooth();
		celular.procuraTexto("BY COLOR");
		produtos.clickRoxo();
		produtos.clickApply();
	}

	@Entao("^aparece a mensagem de que nao exste o produto$")
	public void aparece_a_mensagem_de_que_nao_exste_o_produto() {
		assertEquals(produtos.expectativaHome(), produtos.getAtualHome());
	}
}
