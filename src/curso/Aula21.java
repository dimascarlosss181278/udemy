package curso;

import java.util.Locale;
import java.util.Scanner;

public class Aula21 {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine(); 
		sc.nextLine();
		int bad = sc.nextInt();
		double price = sc.nextDouble();
		String dados = sc.nextLine();
		String unome = dados.substring(0,4);
		String age = dados.substring(6,7);
		String altura = dados.substring(9,12);
		
		//Green 21 1.73
		System.out.println("Enter your full name: ");
		System.out.println(nome);
		System.out.println("How many bedrooms are there is your house? ");
		System.out.println(bad);
		System.out.println("Enter product price: ");
		System.out.println(price);
		System.out.println("Enter your full name: ");
		System.out.println(unome);
		System.out.println(age);
		System.out.println(altura);
		
		
		
		sc.close();
	}

}
