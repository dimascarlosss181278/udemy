package exercicio;

//import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Aula43Retangulo {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();//instanciando objeto da classe retangulo
		
		System.out.print("Informe a base do retangulo : ");
		ret.base = sc.nextDouble();
		System.out.print("Informe a altura do retangulo : ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("A area do retangulo e : %.2f %n", ret.area());
		
		System.out.printf("O perimetro do retangulo e : %.2f %n", ret.perimetro());
		
		System.out.printf("A diagonal do retangulo e:  %.2f %n" , ret.diagonal());
		
		sc.close();
	}

}
