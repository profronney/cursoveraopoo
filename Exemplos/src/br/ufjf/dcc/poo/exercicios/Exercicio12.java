package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com um número inteiro positivo: ");
		int numero = teclado.nextInt();
		for (int i = 0; i < numero; i++) {
			System.out.println("Faça os exercicios novamente.");
		}
	}

}
