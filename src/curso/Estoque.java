package curso;

import java.util.Scanner;

import entidades.Produto;

public class Estoque {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Product[] vect = new Product[n];
		Produto prod = new Produto();
		
		System.out.println("Entre com os dados do Produto : ");
		System.out.print("Nome Produto : ");
		prod.nome = sc.nextLine();
		
		System.out.print("Preco : ");
		prod.preco = sc.nextDouble();
		
		System.out.print("Quantidade : ");
		prod.quant = sc.nextInt();
		
		System.out.println(prod.nome + " , " + prod.preco + " , " + prod.quant);;
		
		sc.close();
	}

}
