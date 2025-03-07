package org.estabelecimento;

import exemplointerface.equipamentos.digitalizadora.Digitalizadora;
import exemplointerface.equipamentos.impressora.Impressora;
import exemplointerface.equipamentos.copiadora.Copiadora;
import exemplointerface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
	EquipamentoMultifuncional em = new EquipamentoMultifuncional();
	
	Impressora impressora = em;
	Digitalizadora digitalizadora = em;
	Copiadora copiadora = em;
	
	impressora.imprimir();
	digitalizadora.digitalizar();
	copiadora.copiar();
}
}
