package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		int i = 0;
		int contImpar = 0;
		System.out.print("Entre com um número inteiro. Tecle -1 para terminar: ");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero != -1) {
			if(numero%2 == 0)
				i++;
			System.out.print("Entre com um número inteiro: ");
			teclado = new Scanner(System.in);
		}
		System.out.println("Foram digitados " + i + "números ímpares");

	}

}
