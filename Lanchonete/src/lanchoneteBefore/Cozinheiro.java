package lanchoneteBefore;

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
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER...");
	}
	
	public void prepararSuco() {
		System.out.println("PREPARANDO SUCO...");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE...");
	}
	public void selecionarIngredientesSuco() {
		System.out.println("SELECIONANDO A FRUTA E O LEITE...");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES...");
	}
	public void baterSucoLiquidificador() {
		System.out.println("BATENDO O SUCO...");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER...");
	}
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
