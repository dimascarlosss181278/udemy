package entidades;

public class Funcionarios {

	public String nome;
	public int id;
	public double salario;
	public double imposto;
	public double porc;

	public Funcionarios(int id, String nome, double salario) {
	}	
	
	public Funcionarios() {
	}	
	
	public double salarioLiquido() {
		return (salario - imposto);
	}
	
	public double porcentagem() {
		return (salario * porc)/100;
	}
	
	public double incrementaSalario() {
		return salarioLiquido() + porcentagem();
	}

	public double incSal(double porcentag) {
		 return (salarioLiquido() * porcentag) + salarioLiquido();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	
}
