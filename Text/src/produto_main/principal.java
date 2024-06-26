package produto_main;

import java.util.Scanner;
import produto_main.Produto;

public class principal {

	public static void main(String[] args) {
		Produto pd = new Produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome: ");
		pd.nome = sc.nextLine();
		
		System.out.print("Preco: ");
		pd.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		pd.quantidade = sc.nextInt();
		
		System.out.println("Atualização do produto " + pd); 
		
		System.out.print("Entre com a quantidade de produtos a serem adicionados: ");
		int quantidade = sc.nextInt();
		pd.addProdutos(quantidade);
		
		System.out.println("Atualização do produto " + pd);
		
		System.out.print("Entre com a quantidade de produtos a serem removidos: ");
		quantidade = sc.nextInt();
		pd.removerProdutos(quantidade);
		
		System.out.println("Atualização do produto " + pd);
		
		sc.close();
	
	}

}
