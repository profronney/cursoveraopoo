package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		double x, y, distancia;
		double x1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite x1:", "Valor", JOptionPane.QUESTION_MESSAGE));
		double x2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite x2:", "Valor", JOptionPane.QUESTION_MESSAGE));
		double y1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite y1:", "Valor", JOptionPane.QUESTION_MESSAGE));
		double y2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite y2:", "Valor", JOptionPane.QUESTION_MESSAGE));
		x = Math.pow(x2 - x1, 2);
		y = Math.pow(y2 - y1, 2);
		distancia = Math.sqrt(x + y);
		JOptionPane.showMessageDialog(null, distancia);
	}

}
