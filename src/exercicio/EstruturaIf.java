package exercicio;

import java.util.Scanner;

public class EstruturaIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero a ser analisado: ");
		int num = sc.nextInt();

		if (num <= 12) {
			System.out.println("Bom dia");
		}
		else if(num > 12 && num <=18) {
			System.out.println("Boa tarde");
		}
		else if (num > 18){
			System.out.println("Boa Noite");
		}

		sc.close();
	}

}
