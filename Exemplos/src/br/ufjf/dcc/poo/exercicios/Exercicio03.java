package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float a, b, c, x1, x2;
		float delta;
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		System.out.print("Informe o valor de a: ");
		a = teclado.nextFloat();
		System.out.print("Informe o valor de b: ");
		b = teclado.nextFloat(); 
		System.out.print("Informe o valor de c: ");
		c = teclado.nextFloat();
		delta = (b*b)-(4*a*c);
		x1 = (float) ((-(b) + Math.sqrt(delta))/(2*a));
		x2 = (float) ((-(b) - Math.sqrt(delta))/(2*a));
		System.out.println("Raizes: x1=" + x1 + " e x2=" + x2);

		

	}

}
