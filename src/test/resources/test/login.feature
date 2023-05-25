
Feature: Login 
  I want this user to login in the application

  Scenario: Login succesfully
    Given que eu esteja acessando a tela de login    	
    When eu informar o usuário 'Admin' e a senha 'admin123'
    	And clicar no botão logar
    Then devo estar logado na aplicação