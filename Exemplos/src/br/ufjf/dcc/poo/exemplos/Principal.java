package br.ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.cpf = "001.543.876-52";
		pessoa1.idade = 18;
		pessoa1.nome = "Afú";
		pessoa1.RG = "MG-6548765";
		pessoa1.sexo = "M";
		
		pessoa2.cpf = "009.765.456-78";
		pessoa2.idade = 35;
		pessoa2.nome = "Xabú";
		
		pessoa3.cpf = "098.456.765-45";
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Tio da Limp.";
		funcionario1.cargo = "Faxineiro";
		funcionario1.matricula = "1234567";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Fulano";
		aluno1.curso = "Letras";
		aluno1.registro = "L345678";
		
		Professor professor1 = new Professor();
		professor1.nome = "Robson";
		professor1.matricula = "4578914";
		professor1.numAulas = 20;
		
		
	}

}
