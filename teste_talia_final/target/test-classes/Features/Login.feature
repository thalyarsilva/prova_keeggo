Feature: Login

  @PreencherLogin
  Scenario: Login realizado com Sucesso
    Given que ao clicar no icone user
    When efetuo o login com dados validos
    Then valido o login efetuado com sucesso
