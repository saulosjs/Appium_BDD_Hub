# language: pt

Funcionalidade: Fazer cadastro
  
  Contexto: ir para a pagina de cadastro
    Dado que o usuario esteja na pagina principal do aplicativo
    Quando o usuario entrar na pagina de cadastro

  Cenario: Cadastrar nova conta
    Quando o usuario preencher o formulario   
    E cricar no botao de registra 
    Entao verifica se criou o usuario
    
  Cenario: Falha no cadastro cadastrar
    Quando o usuario preencher o formulario   
    E cricar no botao de registra 
    Entao verifica que o usuario nao foi criado