package exercicio;

//import java.text.NumberFormat;
import java.util.Scanner;

import entidades.Alunos;

public class Aula43Alunos {

	public static void main(String[] args) {

		//NumberFormat z = NumberFormat.getCurrencyInstance();
		Alunos alu = new Alunos();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Aluno : ");
		alu.nome = sc.nextLine();
		System.out.print("Nota 1 : ");
		alu.nota1 = sc.nextDouble();
		System.out.print("Nota 2 : ");
		alu.nota2 = sc.nextDouble();
		System.out.print("Nota 3 : ");
		alu.nota3 = sc.nextDouble();
		System.out.println();
		System.out.printf("A nota final é : %.2f %n", alu.resultado());
		System.out.println("O Status do aluno e : " + alu.situacaoAluno());
		
		sc.close();
	}

}
