package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		float valor1, valor2, valor3;
		float media;
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		System.out.println(" Digite o primeiro valor: ");
		valor1 = teclado.nextFloat();
		System.out.println(" Digite o segundo valor: ");
		valor2 = teclado.nextFloat();
		System.out.println(" Digite o terceiro valor: ");
		valor3 = teclado.nextFloat();
		media = (valor1+valor2+valor3)/3;
		System.out.println("O valor da média é: " + media);
		
	}

}
