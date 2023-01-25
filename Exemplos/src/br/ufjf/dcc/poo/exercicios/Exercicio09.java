package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		float a = Float.parseFloat((JOptionPane.showInputDialog("Digite a")));
		float b = Float.parseFloat((JOptionPane.showInputDialog("Digite b")));
		float c = Float.parseFloat((JOptionPane.showInputDialog("Digite c")));
		if(a > Math.abs(b-c) && a < (b+c) &&
		   b > Math.abs(a-c) && b < (a+c) &&
		   c > Math.abs(b-c) && c < (b+c)){
			JOptionPane.showMessageDialog(null,"O triângulo existe");
		}else {
			JOptionPane.showMessageDialog(null,"O triângulo nâo existe");
		}
	}

}
