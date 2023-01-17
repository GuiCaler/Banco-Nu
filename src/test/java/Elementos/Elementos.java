package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Given que acesse a url "https://nubank.com.br/"

	// And preencha o campo cpf com o cpf "<cpf>"
	private By campoCpf = By.cssSelector("#field-cpf");
	// And click no botao continue
	private By btnContinue = By.cssSelector("#short-form > div.sc-qZtCU.hcBnys > button");
	// When preencha o campo nome com o nome "<nome>"
	private By campoNome = By.name("name");
	// And preencha o campo celular com o celular "<celular>"
	private By campoCelular = By.xpath("//*[@id=\"field-phone\"]");
	// And preencha o campo email com o email "<email>"
	private By campoEmail = By.id("field-email");
	// And preencha o campo email com o email "<confirmacao de email>"
	private By campoConfirmacaoEmail = By.id("field-emailConfirmation");
	// And selecione o checkbox eu aceito receber comunicacoes do Nubank por
	// WhatsApp
	private By checkboxEuaceito = By.cssSelector("#label-acceptedWhatsapp > span.sc-oUDcU.nlWRo > svg");
	// And selecione o checkbox eu li, estou ciente das condicoes de tratamento dos
	// meus dados pessoais e dou consentimento
	private By checkboxEuli = By.cssSelector("#label-accepted > span.sc-oUDcU.nlWRo > svg");
	// And selecione o botao enviar
	private By btnEnviar = By.cssSelector(
			"#complete-form-drawer > div > div > div.sc-pITNg.BTNvH > form > div > div.sc-qXhiz.fVyJdy > div > button");

	// Then sera exibido Informações enviadas
	private By textoInformaçõesEnviadas = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/h4");

	public By getTextoInformaçõesenviadas() {
		return textoInformaçõesEnviadas;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnContinue() {
		return btnContinue;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoCelular() {
		return campoCelular;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoConfirmacaoEmail() {
		return campoConfirmacaoEmail;
	}

	public By getCheckboxEuaceito() {
		return checkboxEuaceito;
	}

	public By getCheckboxEuli() {
		return checkboxEuli;
	}

	public By getBtnEnviar() {
		return btnEnviar;
	}

}
