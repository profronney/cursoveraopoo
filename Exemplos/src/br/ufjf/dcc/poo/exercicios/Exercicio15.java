package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com valor inicial: ");
		int numeroIni = teclado.nextInt();
		
		System.out.print("Entre com valor final: ");
		int numeroFim = teclado.nextInt();
		
		for (int i = numeroIni; i <= numeroFim; i++) {
			System.out.println(i);
		}
		
	}

}
