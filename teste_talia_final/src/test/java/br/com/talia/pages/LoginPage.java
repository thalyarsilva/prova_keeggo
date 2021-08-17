package br.com.talia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(how = How.NAME, using = "username")
	private WebElement name;

	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	@FindBy(how = How.ID, using = "menuUser")
	private  WebElement iconeUser;

	public void clicarUser() {
		iconeUser.click();
		
	}

	public void prencherCampos() {
		try {
			name.sendKeys("Talia");
			Thread.sleep(2000);
			password.sendKeys("senha");

		} catch (InterruptedException e) {
			System.out.println("Não foi possível preencher os campos nome e password\n");
			e.printStackTrace();
		}
	}
}
