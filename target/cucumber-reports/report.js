$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Cadastrar.feature");
formatter.feature({
  "name": "Fazer cadastro",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "ir para a pagina de cadastro",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuario esteja na pagina principal do aplicativo",
  "keyword": "Dado "
});
formatter.match({
  "location": "Cadastro.que_o_usuario_esteja_na_pagina_principal_do_aplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario entrar na pagina de cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "Cadastro.o_usuario_entrar_na_pagina_de_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar nova conta",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "o usuario preencher o formulario",
  "keyword": "Quando "
});
formatter.match({
  "location": "Cadastro.o_usuario_preencher_o_formulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cricar no botao de registra",
  "keyword": "E "
});
formatter.match({
  "location": "Cadastro.cricar_no_botao_de_registra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifica se criou o usuario",
  "keyword": "Entao "
});
formatter.match({
  "location": "Cadastro.verifica_se_criou_o_usuario()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[manoBrou17]\u003e but was:\u003c[LOGIN]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat br.com.rsinet.hub_appium.stepDefinition.Cadastro.verifica_se_criou_o_usuario(Cadastro.java:86)\r\n\tat ✽.verifica se criou o usuario(Feature/Cadastrar.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "ir para a pagina de cadastro",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuario esteja na pagina principal do aplicativo",
  "keyword": "Dado "
});
formatter.match({
  "location": "Cadastro.que_o_usuario_esteja_na_pagina_principal_do_aplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario entrar na pagina de cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "Cadastro.o_usuario_entrar_na_pagina_de_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Falha no cadastro cadastrar",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "o usuario preencher o formulario",
  "keyword": "Quando "
});
formatter.match({
  "location": "Cadastro.o_usuario_preencher_o_formulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cricar no botao de registra",
  "keyword": "E "
});
formatter.match({
  "location": "Cadastro.cricar_no_botao_de_registra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifica que o usuario nao foi criado",
  "keyword": "Entao "
});
formatter.match({
  "location": "Cadastro.verifica_que_o_usuario_nao_foi_criado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("Feature/PesquisaPelaLupa.feature");
formatter.feature({
  "name": "Fazer pesquisa de um produto pela lupa",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Ir para a pagina de cadastro",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuario esteja na pagina principal do aplicativo.",
  "keyword": "Dado "
});
formatter.match({
  "location": "PesquisaPelaLupa.que_o_usuario_esteja_na_pagina_principal_do_aplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pesquisar com sucesso",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "o usuario pesquisar algum prduto na lupa",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPelaLupa.o_usuario_pesquisar_algum_prduto_na_lupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolher o produto",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaPelaLupa.escolher_o_produto()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat br.com.rsinet.hub_appium.pageObject.PageProdutos.getTitle(PageProdutos.java:26)\r\n\tat br.com.rsinet.hub_appium.stepDefinition.PesquisaPelaLupa.escolher_o_produto(PesquisaPelaLupa.java:54)\r\n\tat ✽.escolher o produto(Feature/PesquisaPelaLupa.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verificar as informacoes do produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPelaLupa.verificar_as_informacoes_do_produto()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});