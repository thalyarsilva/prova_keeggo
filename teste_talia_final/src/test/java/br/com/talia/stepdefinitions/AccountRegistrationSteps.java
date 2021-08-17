package br.com.talia.stepdefinitions;

import br.com.talia.metodos.AccountRegistrationMetodos;
import br.com.talia.util.OpenBrownser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountRegistrationSteps {

	AccountRegistrationMetodos accountRegistrationMetodos = new AccountRegistrationMetodos();
	OpenBrownser openBrownser = new OpenBrownser();

	@Given("com navegador aberto no site  da advantageonlineshopping")
	public void com_navegador_aberto_no_site_da_advantageonlineshopping() {
		openBrownser.open("http://advantageonlineshopping.com/#/");
		accountRegistrationMetodos.botaoUser();
		System.out.println("Passo 1 - Funcionalidade Registrar Cadastro: Navegador aberto no Site/n");
	}

	@And("que ao preencher os campos")
	public void que_ao_preencher_os_campos() {
		accountRegistrationMetodos.DigitarNome();
		accountRegistrationMetodos.DigitarEmail();
		accountRegistrationMetodos.DigitarSenha();
		accountRegistrationMetodos.ConfirmarSenha();
		System.out.println("Passo 2 - Funcionalidade Registrar Cadastro: Preenchimento com sucesso/n");
	}

	@When("submeto os dados")
	public void submeto_os_dados() {
		accountRegistrationMetodos.DigitarPrimeiroNome();
		accountRegistrationMetodos.DigitarUltimoNome();
		accountRegistrationMetodos.DigitarTelefone();
		accountRegistrationMetodos.EscolherPais();
		accountRegistrationMetodos.DigitarCidade();
		accountRegistrationMetodos.DigitarEndereco();
		accountRegistrationMetodos.DigitarEstado();
		accountRegistrationMetodos.DigitarCodigoPostal();
		accountRegistrationMetodos.SelecionarConcordoTermos();
		System.out.println("Passo 3 - Funcionalidade Registrar Cadastro: Submeter dados com sucesso/n");

	}

	@Then("valido cadastro efetuado com sucesso")
	public void valido_cadastro_efetuado_com_sucesso() {
		accountRegistrationMetodos.RegistarCadastro();
		System.out.println("Passo 4 - Funcionalidade Registrar Cadastro: Cadastro Validado com sucesso/n");

	}

}
