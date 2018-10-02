package entidades;

public class Alunos {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
		
	public double resultado() {
		return (nota1 + nota2 + nota3);
	}

	public String situacaoAluno() {
		if (resultado() >= 60.00) {
			return "APROVADO";
		} else {
			return "REPROVADO";
		}
	}

}
