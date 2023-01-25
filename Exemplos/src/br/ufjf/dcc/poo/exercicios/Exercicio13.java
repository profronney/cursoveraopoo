package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		int i = 0;
		int soma = 0;
		float media = 0;
		System.out.print("Entre com um número inteiro: ");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero != -1) {
			soma = soma + numero;
			i++;
			teclado = new Scanner(System.in);
			numero = teclado.nextInt();
			System.out.print("Entre com um número inteiro: ");
		}
		media = soma/i;
		System.out.println("Média: " + media);
		
	}

}
