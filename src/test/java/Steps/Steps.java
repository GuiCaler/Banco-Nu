package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que acesse a url {string}")
	public void que_acesse_a_url(String url) {
		m.abrirNavegador(url);
	}

	@Given("preencha o campo cpf com o cpf {string}")
	public void preencha_o_campo_cpf_com_o_cpf(String string) {
		m.clicar(e.getCampoCpf());
		m.preencher(e.getCampoCpf(), string);

	}

	@Given("click no botao continue")
	public void click_no_botao_continue() throws InterruptedException {
		m.clicar(e.getBtnContinue());
		m.pausa(1000);

	}

	@When("preencha o campo nome com o nome {string}")
	public void preencha_o_campo_nome_com_o_nome(String string) {
		m.preencher(e.getCampoNome(), string);

	}

	@When("preencha o campo celular com o celular {string}")
	public void preencha_o_campo_celular_com_o_celular(String string) {
		m.preencher(e.getCampoCelular(), string);

	}

	@When("preencha o campo email com o email {string}")
	public void preencha_o_campo_email_com_o_email(String string) {
		m.preencher(e.getCampoEmail(), string);

	}

	@When("preencha o campo confimar email com o confirmar email {string}")
	public void preencha_o_campo_confimar_email_com_o_confirmar_email(String string) {
		m.preencher(e.getCampoConfirmacaoEmail(), string);

	}

	@When("selecione o checkbox eu aceito receber comunicacoes do Nubank por WhatsApp")
	public void selecione_o_checkbox_eu_aceito_receber_comunicacoes_do_nubank_por_whats_app() {
		m.clicar(e.getCheckboxEuaceito());

	}

	@When("selecione o checkbox eu li, estou ciente das condicoes de tratamento dos meus dados pessoais e dou consentimento")
	public void selecione_o_checkbox_eu_li_estou_ciente_das_condicoes_de_tratamento_dos_meus_dados_pessoais_e_dou_consentimento() throws InterruptedException {
		m.clicar(e.getCheckboxEuli());
		m.pausa(1000);
	}

	@Then("selecione o botao enviar")
	public void selecione_o_botao_enviar() {
		m.clicar(e.getBtnEnviar());
	}

}
