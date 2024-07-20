package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
		protected void salvarHistoricoMensagem() {
			System.out.println("salvando historico da mensagem...");
		}
		
		//somente os filhos conhecem este método
		protected void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet");
		}
		
}
