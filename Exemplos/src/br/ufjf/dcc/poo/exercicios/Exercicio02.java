package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float larter, profter, areater;
		float larcasa, profcasa, areacasa;
		float areaRestante;
		
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		
		System.out.println("Digite a largura do terreno: ");
		larter = teclado.nextFloat();
		System.out.println("Digite a profundidade do terreno: ");
		profter = teclado.nextFloat();
		areater = larter*profter;
		
		System.out.println("Digite a largura da casa: ");
		larcasa = teclado.nextFloat();
		System.out.println("Digite a profundidade da casa: ");
		profcasa = teclado.nextFloat();
		areacasa = larcasa*profcasa;
		
		areaRestante = areater - areacasa;
		
		System.out.println("A percentagem de área restante é:" + (areaRestante/areater)*100);


	}

}
