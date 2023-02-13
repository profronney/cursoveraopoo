package br.ufjf.dcc.poo.exemplos;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		float num1 = 0;
		float num2 = 0;
		String operacao;
		
		try {
			num1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro valor:"));
			num2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo valor:"));
			operacao = JOptionPane.showInputDialog("Entre com a operação:");
			if(operacao.equals("SOM")) {
				JOptionPane.showMessageDialog(null, num1+num2);
			}else if (operacao.equals("SUB")) {
				JOptionPane.showMessageDialog(null, num1-num2);
			}else if (operacao.equals("MUL")) {
				JOptionPane.showMessageDialog(null, num1*num2);
			}else if (operacao.equals("DIV")) {
				JOptionPane.showMessageDialog(null, num1/num2);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro de formato de número", "Erro", 0, null);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro de divisão por zero", "Erro", 0, null);
			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Programa concluído", "Conclusão", 0, null);
		}

	}

}
