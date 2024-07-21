package usuario;

import aparelhos.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.adicionarNovaAba();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.pausar();
	}
}
