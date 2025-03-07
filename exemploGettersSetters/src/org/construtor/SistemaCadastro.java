package org.construtor;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		
		Pessoa marcos = new Pessoa("Marcos","12345678963");
		
		//definimos o endereço de maarcos
		marcos.setEndereco("Rua das Marias");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}

}
