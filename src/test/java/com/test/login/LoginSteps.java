package com.test.login;

import static org.junit.Assert.assertTrue;

import com.page.LoginPage;
import com.page.MainPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private LoginPage loginPage;
	private MainPage mainPage;
	
	@Given("que eu esteja acessando a tela de login")
	public void que_eu_esteja_acessando_a_tela_de_login() {
		loginPage = new LoginPage();
		loginPage.open();		
	}

	@When("eu informar o usuário {string} e a senha {string}")
	public void eu_informar_o_usuário_e_a_senha(String user, String password) {
	    loginPage.inputUser(user);
	    loginPage.inputPass(password);
	}

	@And("clicar no botão logar")
	public void clicar_no_botão_logar() {
		mainPage = loginPage.clickLogin();
	}

	@Then("devo estar logado na aplicação")
	public void devo_estar_logado_na_aplicação() {		
	     assertTrue(mainPage.isEnabledMenuHamurger());
	}
	
	
	

}
