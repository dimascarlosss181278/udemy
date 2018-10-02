package exercicio;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionarios;

public class Aula43Funcionario {

	public static void main(String[] args) {

		NumberFormat z = NumberFormat.getCurrencyInstance();

		Locale.setDefault(Locale.US);
		Funcionarios fu = new Funcionarios();
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome : ");
		fu.nome = sc.nextLine();
		System.out.print("Salario : ");
		fu.salario = sc.nextDouble();
		System.out.print("Impostos : ");
		fu.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionario : " + fu.nome + ", $ " + fu.salario);
		System.out.println();
		System.out.print("Informe o percentual de reajuste do salario : ");
		fu.porc = sc.nextDouble();
		System.out.println();
		System.out.println("Atualização de funcionario : " + fu.nome + ", $ " + z.format(fu.incrementaSalario()));
		
		//System.out.println(z.format(price));

		sc.close();
	}

}
