package Construtor;

public class Produto {
		
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto() {
		
	}
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome 
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidade(s), Total: $ "
				+ String.format("%.2f", valorTotalEstoque());			
	}
		
}