package br.com.talia.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.talia.metodos.LoginMetodos;
import br.com.talia.pages.LoginPage;
import br.com.talia.util.OpenBrownser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	 
	OpenBrownser openBrownser = new OpenBrownser();
	LoginPage loginPage;

	@Given("^que ao clicar no icone user$")
	public void que_ao_clicar_no_icone_user() {
		openBrownser.open("http://advantageonlineshopping.com/#/");
		loginPage.clicarUser();
		System.out.println("Passo 1 - Cliquei no icone de usuario.");

	}

	@When("^efetuo o login com dados validos$")
	public void efetuo_o_login_com_dados_validos() {
		loginPage.prencherCampos();
		System.out.println("Passo 2 - Inseri meus dados de login.");
	}

	@Then("^valido o login efetuado com sucesso$")
	public void valido_efetuado_com_sucesso() {
		System.out.println("Passo 3 - Login ocorreu com sucesso.");
	}

}
