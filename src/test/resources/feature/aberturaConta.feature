@Abertura-de-conta
Feature: Abertura de conta Nu

  @PessoaFisica
  Scenario: Abertura de conta pessoa fisica
    Given que acesse a url "https://nubank.com.br/"
    And preencha o campo cpf com o cpf "<cpf>"
    And click no botao continue
    When preencha o campo nome com o nome "<nome>"
    And preencha o campo celular com o celular "<celular>"
    And preencha o campo email com o email "<email>"
    And preencha o campo confimar email com o confirmar email "<email>"
    And selecione o checkbox eu aceito receber comunicacoes do Nubank por WhatsApp
    And selecione o checkbox eu li, estou ciente das condicoes de tratamento dos meus dados pessoais e dou consentimento
    Then selecione o botao enviar
    
   
    
    Examples: 
|nome                         	|celular      |email               |cpf          |
|Diego Lucca Alexandre Souza  	|27993297322 	 |teste@teste.com     |42519644460  |
