package curso;

import java.util.Scanner;

public class Aula20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		
		sc.close();
		
	}	
	
}
