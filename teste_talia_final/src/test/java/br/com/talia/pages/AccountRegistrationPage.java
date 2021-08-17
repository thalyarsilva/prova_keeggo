package br.com.talia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountRegistrationPage {

	WebDriver driver;

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement iconeUser;

	public void clicarUser() {
		iconeUser.click();

	}

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]/font/font")
	private WebElement clicarCriarConta;

	public void clicarCriarUmaConta() {
		clicarCriarConta.click();

	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement escreverNome;

	public <nome> void campoNome() {
		escreverNome.sendKeys("Talia ");
	}

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement escreverEmail;

	public void digitarEmail() {
		escreverEmail.sendKeys("talia@gmail.com");
	}

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement escreverSenha;

	public void digitaSenha() {
		escreverSenha.sendKeys("123456");
	}

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement campoConfirmaSenha;

	public void confirmarSenha() {
		campoConfirmaSenha.sendKeys("123456");
	}

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement escreverPrimeiroName;

	public void digitaPrimeiroNome() {
		escreverPrimeiroName.sendKeys("Talia");
	}

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement escreverSegundoName;

	public void digitaSegundoNome() {
		escreverSegundoName.sendKeys("Rocha");
	}

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement escreverTelefone;

	public void digitaTelefone() {
		escreverTelefone.sendKeys("987654321");
	}

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement clicarEsolherPais;

	public <pais> void escolherPais() {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("clicarEsolherPais.scrollBy(0,250)", "");
		clicarEsolherPais.click();
		//// *[@id="formCover"]/div[3]/div[1]/sec-view[1]/div/select/option[13]

		
		
		
		//
		//CRIAR MÉTODO PARA ESCOLHER O PAIS DO COMBOBOX
		//
		//
	}

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement escreverCidade;

	public void digitarCidade() {
		escreverCidade.sendKeys("Osasco");

	}

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement escreverEndereco;

	public void digitaEndereco() {
		escreverEndereco.sendKeys("Rua nove de setembro");
	}

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement escreverEstado;

	public void digitaEstadol() {
		escreverEstado.sendKeys("Sao Paulo");
	}

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement escreverCodigoPostal;

	public void digitaCodigoPostal() {
		escreverCodigoPostal.sendKeys("000000");
	}

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement clicarAceita;

	public void AceitarTermoCondicao() {
		clicarAceita.click();

	}

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement clicarRegistra;

	public void registrarCadastro() {
		clicarRegistra.click();
	}

}
