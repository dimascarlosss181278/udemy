package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula68Listas {

	public static void main(String[] args) {
		
		//instancia o objeto lista
		List<String> list = new ArrayList<>();
		
		//adicionar na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		//imprimir tamanho da lista
		System.out.println(list.size());
		
		//imprime toda lista
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//remove elementos da lista - predicado, remove todos os elementos que comecem com a letra M, retorna
		//verdadeiro ou falso, (x -> x.charAt(0) == 'M') é uma expressao LAMBDA
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//imprime a posicao da lista de acordo com o que foi definido em list.indexOf("Bob")
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		//Filtrar na lista apenas elementos comecados com a letra A, list.stream().filter(x -> x.charAt(0) == 'A') é uma expressao LAMBDA
		//.collect(Collectors.toList()) esta convertendo a o tipo String para tipo list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//imprime o primeiro elemento da lista que comece com J, caso nao encontre ele retorna NULO
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
