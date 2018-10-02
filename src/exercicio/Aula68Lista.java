package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class Aula68Lista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> list = new ArrayList<>();

		System.out.print("Numero de funcionarios a ser registrados: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario # " + i + ": ");
			System.out.print("Id : ");
			int id = sc.nextInt();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Salario : ");
			double salario = sc.nextDouble();

			// adiciona elementos id, nome e salario na lista instanciada a partir da classe
			// Funcionarios
			list.add(new Funcionarios(id, nome, salario));
		}

		// implementa o acrescimo no salario do funcionario selecionado
		System.out.print("Informe o Id do funcionario para reajuste: ");
		int id = sc.nextInt();
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		Employee     emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.incSal(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Funcionarios obj : list) {
			System.out.print((int)obj.id + " , " + (String)obj.nome + " , " + (double)obj.salario);
		}
		
		sc.close();
	}

}
