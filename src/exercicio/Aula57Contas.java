package exercicio;

//import java.util.Locale;
import java.util.Scanner;
import entidades.Contas;

public class Aula57Contas {

		public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contas conta;
		
		
		System.out.print("Entre com o numero da conta : ");
		int numero = sc.nextInt();
		
		System.out.print("Entre com o nome do titular da conta");
		sc.hasNextLine();
		String nome = sc.nextLine();
		
		System.out.println("Tem deposito inicial?  S/N");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Entre com deposito incial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Contas(numero, nome, depositoInicial);
		}
			else {
			conta = new Contas(numero, nome);
		}
		
		System.out.println();
		System.out.println("Conta : ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);
		System.out.println("Conta atualizada");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.println("Conta atualizada");
		System.out.println(conta);		
		
		sc.close();
	}

}
