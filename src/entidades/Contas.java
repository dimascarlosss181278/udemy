package entidades;

public class Contas {

	private int numero;
	private String nome;
	private double saldo;
	
	public Contas(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Contas(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

  public void deposito(double amount) {
	  saldo += amount;
  }
	
public void saque(double amount) {
	 saldo -= amount + 5.0;
}
  
public String toString() {
	return "Conta " 
			+ numero
			+ ", Nome: "
			+ ", Saldo: $ "
			+ String.format("%.2f", saldo);
}

}
