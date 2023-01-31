package br.ufjf.dcc.poo.exercicio21;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setMatricula("123456789");
		aluno.setNome("Afú");
		aluno.setNota1(9);
		aluno.setNota2(10);
		aluno.setNotaTrabalho(4);
		System.out.println(aluno.media());
		System.out.println(aluno.resultadoFinal());
	}

}
