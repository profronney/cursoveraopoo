package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		int numSorteado = (int) (Math.random()*10);
		int numDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		if(numDigitado > numSorteado) {
			JOptionPane.showMessageDialog(null, "O número é maior que o sorteado");
		} else if(numDigitado < numSorteado) {
			JOptionPane.showMessageDialog(null, "O número é menor que o sorteado");
		} else {
			JOptionPane.showMessageDialog(null, "O número é igual que o sorteado");
		}

	}

}
