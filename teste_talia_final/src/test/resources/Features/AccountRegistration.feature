Feature: Login

  @PreencherCadastro
  Scenario: Cadastro realizado com sucesso
    Given com navegador aberto no site  da advantageonlineshopping
    And que ao preencher os campos
    When submeto os dados
    Then valido cadastro efetuado com sucesso
