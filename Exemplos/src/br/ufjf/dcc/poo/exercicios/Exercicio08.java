package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		if(idade <= 3) {
			JOptionPane.showMessageDialog(null, "Bebê");
		}else if(idade <= 13) {
			JOptionPane.showMessageDialog(null, "Criança");
		}else if(idade < 20) {
			JOptionPane.showMessageDialog(null, "Adolescente");
		}else if(idade < 65) {
			JOptionPane.showMessageDialog(null, "Adulto");
		}else { 
			JOptionPane.showMessageDialog(null, "Idoso");
		}
	}
}
