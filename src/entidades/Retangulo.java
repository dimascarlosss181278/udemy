package entidades;


public class Retangulo {

	public double base;
	public double altura;
	
	//Locale.setDefault(Locale.US);
	
	public double area() {
		return (base * altura);
	}
	
	public double perimetro() {
		return ((base + altura) * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(((base * base) + (altura * altura)));
				//((base * base) + (altura * altura));
	}
	
}
