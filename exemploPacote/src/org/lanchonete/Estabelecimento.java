package org.lanchonete;

import org.lanchonete.area.cliente.Cliente;
import org.lanchonete.atendimento.Atendente;
import org.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
	    Cozinheiro cozinheiro = new Cozinheiro();
	    //Açoes que estabelecimento precisa ter ciencia
	    cozinheiro.adicionarComboNoBalcao();
	    cozinheiro.adicionarLancheNoBalcao();
	    cozinheiro.adicionarSucoNoBalcao();
	       
	    
	    Atendente atendente = new Atendente();
	    atendente.servindoMesa();
	    atendente.receberPagamento();
	    
	 
	    Cliente cliente = new Cliente();
	    cliente.escolherLanche();
	    cliente.fazerPedido();
	    cliente.pagarConta();
	      

}
}
