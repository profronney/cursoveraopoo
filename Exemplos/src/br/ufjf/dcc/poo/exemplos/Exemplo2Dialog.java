package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialog {

	public static void main(String[] args) {
		float valor1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:", "Valor", JOptionPane.QUESTION_MESSAGE));
		float valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:", "Valor", JOptionPane.QUESTION_MESSAGE));
		float soma = valor1 + valor2;
		JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma,"Resultado", JOptionPane.INFORMATION_MESSAGE, null);	}

}
