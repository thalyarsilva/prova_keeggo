$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login realizado com Sucesso",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PreencherLogin"
    }
  ]
});
formatter.step({
  "name": "que ao clicar no icone user",
  "keyword": "Given "
});
formatter.match({
  "location": "br.com.talia.stepdefinitions.LoginSteps.que_ao_clicar_no_icone_user()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat br.com.talia.pages.LoginPage.clicarUser(LoginPage.java:24)\r\n\tat br.com.talia.stepdefinitions.LoginSteps.que_ao_clicar_no_icone_user(LoginSteps.java:22)\r\n\tat ✽.que ao clicar no icone user(file:///C:/Users/s.macedo.dos.santos/Desktop/PASTA/teste_talia_final/src/test/resources/Features/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "efetuo o login com dados validos",
  "keyword": "When "
});
formatter.match({
  "location": "br.com.talia.stepdefinitions.LoginSteps.efetuo_o_login_com_dados_validos()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "valido o login efetuado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "br.com.talia.stepdefinitions.LoginSteps.valido_efetuado_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
});