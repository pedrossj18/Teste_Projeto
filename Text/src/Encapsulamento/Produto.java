package Encapsulamento;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getpreco() {
		return preco;
	}
	public void setpreco(double preco) {
		this.preco = preco;
	}
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	public int getquantidade() {
		return quantidade;
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