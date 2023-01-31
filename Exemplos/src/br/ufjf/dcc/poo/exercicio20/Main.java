package br.ufjf.dcc.poo.exercicio20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Zé", 35);
		Pessoa p2 = new Pessoa("Ana", 42, "F");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Jorge");
		p3.setIdade(37);
		p3.setSexo("M");
		p3.setCpf("001.345.654-76");
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(teclado.nextLine());
			System.out.println("Digite a idade da pessoa: ");
			p.setIdade(Integer.parseInt(teclado.nextLine()));
			System.out.println("Digite o sexo da pessoa: ");
			p.setSexo(teclado.nextLine());
			pessoas.add(p);
		}
		
		for(Pessoa p :pessoas) {
			System.out.println("O nome da pessoa é: " + p.getNome());
			System.out.println("A idade da pessoa é: " + p.getIdade());
			System.out.println("O sexo da pessoa é: " + p.getSexo());
		}

	}

}
