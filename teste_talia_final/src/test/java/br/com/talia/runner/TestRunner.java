package br.com.talia.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"br.com.talia.stepdefinitions"},
		
		//Esse termo auxilia na visualizacao no console formatando o texto
		monochrome = true,
		
		//Esse termo cria na pasta target um log com os resultados dos testes
		//posso salvar no formato HTML, Json ou XML, nesse caso salvarei em HTML
		plugin = {"pretty","html:target/HTMLReports"},
		tags = "@PreencherLogin"	
		//tags = "@PreencherCadastro"	
				
		)

public class TestRunner {

}
