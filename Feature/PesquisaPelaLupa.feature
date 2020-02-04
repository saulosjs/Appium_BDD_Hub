# language: pt

Funcionalidade: Fazer pesquisa de um produto pela lupa
  
  Contexto: Ir para a pagina de cadastro
    Dado que o usuario esteja na pagina principal do aplicativo.

  Cenario: Pesquisar com sucesso
    Quando o usuario pesquisar algum prduto na lupa   
    E escolher o produto
    Entao verificar as informacoes do produto