package curso;

public class Aula66LacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------------");
		
		for (String obj : vect) { //lemos : para todo obj contido em vect faça
			System.out.println(obj);
		}

	}

}
