package entidades;

public class Produto {

public String nome;
public double preco;
public int quant;

public Produto() {

};

public Produto(String nome, double preco) {
	this.nome = nome;
	this.preco = preco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}


public double totalValorEmEstoque() {
return preco * quant;
}

public void addProduto(int quant) {
	this.quant += quant; 
}

public void removeProduto(int quant) {
	this.quant -= quant;
}

}
