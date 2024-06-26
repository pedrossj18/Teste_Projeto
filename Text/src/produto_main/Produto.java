package produto_main;

public class Produto {
		
	String nome;
	double preco;
	int quantidade;
	
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