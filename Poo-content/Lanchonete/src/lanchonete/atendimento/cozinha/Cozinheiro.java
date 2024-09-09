package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO...");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO...");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER...");
	}
	
	private void prepararSuco() {
		System.out.println("PREPARANDO SUCO...");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE...");
	}
	private void selecionarIngredientesSuco() {
		System.out.println("SELECIONANDO A FRUTA E O LEITE...");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES...");
	}
	private void baterSucoLiquidificador() {
		System.out.println("BATENDO O SUCO...");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER...");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
