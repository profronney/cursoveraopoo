package br.ufjf.dcc.poo.exercicio21;

public class Aluno {
	private String matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float notaTrabalho;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public float media() {
		return (this.nota1 + this.nota2 + this.notaTrabalho)/3;
	}
	
	public String resultadoFinal() {
		String retorno = "";
		float media = (this.nota1 + this.nota2 + this.notaTrabalho)/3;
		if(media >= 4 && media < 6) {
			retorno = "FINAL";
		}else if (media >= 6) {
			retorno = "APROVADO";
		}else {
			retorno = "REPROVADO";
		}
		return retorno;
	}
	
	
}
