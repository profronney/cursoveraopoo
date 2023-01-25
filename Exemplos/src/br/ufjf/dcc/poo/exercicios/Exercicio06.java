package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		int distancia, tanque;
		distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distância:", "Distância", JOptionPane.QUESTION_MESSAGE));
		tanque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de litros do tanque:", "Tanque", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "O consumo foi: " + distancia/tanque + " Km/l" );

	}

}
