package exercicio;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Aula21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        NumberFormat z = NumberFormat.getCurrencyInstance();
		
		Scanner sc   = new Scanner(System.in);
        String nome  = sc.nextLine(); 
		int bed      = sc.nextInt();
		double price = sc.nextDouble();
		sc.nextLine();
		String nomec = sc.nextLine();
		String unome = nomec.substring(0, 5);
		String age   = nomec.substring(6, 8);
		String alt   = nomec.substring(9, 13);
		
		//Green 21 1.73

	    System.out.println("Enter your full name: ");
		System.out.println(nome);
		System.out.println(bed);
		System.out.println(z.format(price));
		//System.out.println(NumberFormat.getCurrencyInstance().format(price));
		System.out.println(unome);
		System.out.println(age);
		System.out.println(alt);
		
		
		// Alex Green
		//System.out.println("How many bedrooms are there in your house?");
		// 3
		//System.out.println("Enter product price: ");
		// 500.50
		//System.out.println("Enter your last name, age and height (same line): ");
		
		sc.close();
	}

}
