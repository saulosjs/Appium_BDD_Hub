# language: pt

Funcionalidade: Fazer pesquisa de um produto pela lupa
  
  Contexto: Ir para a pagina de cadastro
    Dado que o usuario esteja na pagina principal do aplicativo.

  Cenario: Sucesso na pesquisa pela lupa
    Quando o usuario pesquisar algum prduto na lupa   
    E escolher o produto
    Entao verificar as informacoes do produto
    
  Cenario: Falha na pesquisa pela lupa 
    Quando o usuario pesquisar algum prduto que nao existe na lupa
    Entao verifica a mensagem de erro
    