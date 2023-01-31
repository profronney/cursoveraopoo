package br.ufjf.dcc.poo.exemplos;

import java.util.List;

public class PrincipalNew {

	public static void main(String[] args) {
		
		PessoaNew p1 = new PessoaNew();
		p1.nome = "Joao";
		p1.idade = 21;
		
		PessoaNew p2 = new PessoaNew();
		p2.nome = "Alice";
		p2.idade = 34;
		
		System.out.println("Pessoas: ");
		
		System.out.println("O nome da pessoa 1 é: " + p1.nome);
		System.out.println("A idade da pessoa 1 é: " + p1.idade);
		
		System.out.println("O nome da pessoa 2 é: " + p2.nome);
		System.out.println("A idade da pessoa 2 é: " + p2.idade);
		
		List<PessoaNew> pessoas;


	}

}
