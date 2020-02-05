# language: pt

Funcionalidade: Fazer pesquisa de um produto pela pagina principal
  
  Contexto: Ir para a pagina principal do advantage
    Dado que o usuario esteja na pagina principal do aplicativo advantage

  Cenario: Sucesso na pesquisa pela pagina principal
    Quando o usuario clicar no tipo do produto
    E escolher um dos produtos
    Entao aparece as informacoes do produto
    
  Cenario: Falha na pesquisa pela pagina principal
    Quando o usuario clicar no tipo do produto
    E colocar as especificacao no fildro
    Entao aparece a mensagem de que nao exste o produto