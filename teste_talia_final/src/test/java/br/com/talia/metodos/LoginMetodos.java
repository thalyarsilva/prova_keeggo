package br.com.talia.metodos;

import br.com.talia.pages.LoginPage;

public class LoginMetodos {

	LoginPage loginPage;

	public void botaoUser() {
		loginPage.clicarUser();
	}

	public void preencherCampos() {
		loginPage.prencherCampos();
	}

}
