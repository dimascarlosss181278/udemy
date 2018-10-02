package curso;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Array2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		for (int i=0; i<vect.length;) { //UTILIZAR A PROPRIEDADE LENGHT DO VETOR AI INVES DE "n" i<n
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
			i++;
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length;) {
			sum += vect[i].getPreco();
			i++;
		}
		double avg = sum / vect.length;
		
		System.out.printf("A media de preco e: %.2f%n", avg );
		
		sc.close();
	}

}
