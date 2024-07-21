package aparelhos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA PELO NAVEGAGOR IPHONE");
		
	}
	public void atender() {
		System.out.println("ATENDENDO PELO IPHONE");
		
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA NO NAVEGAGOR IPHONE");
		
	}
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PAGINA PELO NAVEGAGOR IPHONE");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
		
	}
	public void ligar(String numero) {
		System.out.println("LIGANDO NO IPHONE");
		
	}
	public void pausar() {
		System.out.println("PAUSANDO MUSICA NO IPHONE");
		
	}
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA NO IPHONE");
		
	}
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO IPHONE");
		
	}
}
