package curso;

//import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
				
				//Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
		
				System.out.print("Informe a quantidade de posicoes do vetor : ");
				int n = sc.nextInt();
				System.out.println();
				double[] vect = new double[n];
								
				for (int i=0; i<n;) {
					System.out.print("Informe a altura na posicao : " + i + "  ");
					vect[i] = sc.nextDouble();
					System.out.println();
					i++;
				}
				
				double sum = 0.0;
				for (int i=0; i<n; i++) {
					sum += vect[i];
				}
				
				double avg = sum / n;
				
				System.out.print("A media das alturas e : ");
				System.out.println(avg);
				
				sc.close();
	}

}
