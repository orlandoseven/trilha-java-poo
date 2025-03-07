package org.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Menssager");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Menssager");

	}
   
}
