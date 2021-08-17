package br.com.talia.metodos;

import br.com.talia.pages.AccountRegistrationPage;

public class AccountRegistrationMetodos {

	AccountRegistrationPage accountRegistrationPage = new AccountRegistrationPage();

	public void botaoUser() {
		accountRegistrationPage.clicarUser();

	}

	public void ClicoEmCriarConta() {
		accountRegistrationPage.clicarCriarUmaConta();
	}

	public void DigitarNome() {
		accountRegistrationPage.campoNome();
	}

	public void DigitarEmail() {
		accountRegistrationPage.digitarEmail();
	}

	public void DigitarSenha() {
		accountRegistrationPage.digitaSenha();
	}

	public void ConfirmarSenha() {
		accountRegistrationPage.confirmarSenha();
	}

	public void DigitarPrimeiroNome() {
		accountRegistrationPage.digitaPrimeiroNome();
	}

	public void DigitarUltimoNome() {
		accountRegistrationPage.digitaSegundoNome();
	}

	public void DigitarTelefone() {
		accountRegistrationPage.digitaTelefone();
	}

	public void EscolherPais() {
		accountRegistrationPage.escolherPais();
	}

	public void DigitarCidade() {
		accountRegistrationPage.digitarCidade();
	}

	public void DigitarEndereco() {
		accountRegistrationPage.digitaEndereco();
	}

	public void DigitarEstado() {
		accountRegistrationPage.digitaEstadol();
	}

	public void DigitarCodigoPostal() {
		accountRegistrationPage.digitaCodigoPostal();
	}

	public void SelecionarConcordoTermos() {
		accountRegistrationPage.AceitarTermoCondicao();
	}

	public void RegistarCadastro() {
		accountRegistrationPage.registrarCadastro();
	}
}
