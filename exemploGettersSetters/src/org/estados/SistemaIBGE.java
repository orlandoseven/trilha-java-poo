package org.estados;

public class SistemaIBGE {
public static void main(String[] args) {
	for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
	System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());	
	}
	
	EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO;
	System.out.println(eb.getNome());
	System.out.println(eb.getSigla());
    System.out.println(eb.getIbge());
}
}
