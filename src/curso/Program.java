package curso;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Curso Udemy Java");
		sc.close();

		//Tipos primitivos java
		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041'; // \u0041 é o codigo Unicode da letra A maiuscula
		byte n1 = 126;
		int  n2 = 1000;
		int  n3 = 2147483647;
		long n4 = 2147483648L;
		float n5= 4.5f;
		double n6 = 4.5;
		
		System.out.println("O conteúdo da variável completed : " + completed);
		System.out.println("O conteúdo da variável gender    : " + gender);
		System.out.println("O conteúdo da variável letter    : " + letter);
		System.out.println("O conteúdo da variável n1        : " + n1 );
		System.out.println("O conteúdo da variável n2        : " + n2);
		System.out.println("O conteúdo da variável n3        : " + n3);
		System.out.println("O conteúdo da variável n4        : " + n4);
		System.out.println("O conteúdo da variável n5        : " + n5);
		System.out.println("O conteúdo da variável n6        : " + n6);
		
		
	}

}
