package curso;

import java.util.Scanner;

public class GitHub {

	public static void main(String[] args) {
		// Exemplo capitulo GitHub

		System.out.println("INICIANDO...");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu nome completo: ");
		String msg = sc.nextLine(); 
		System.out.println(msg);
		
		sc.close();
	}

}
