package Construtor;

import java.util.Scanner;
import Construtor.Produto;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto pd = new Produto(nome, preco, quantidade);
		
		System.out.println("Atualização do produto " + pd); 
		
		System.out.print("Entre com a quantidade de produtos a serem adicionados: ");
		quantidade = sc.nextInt();
		pd.addProdutos(quantidade);
		
		System.out.println("Atualização do produto " + pd);
		
		System.out.print("Entre com a quantidade de produtos a serem removidos: ");
		quantidade = sc.nextInt();
		pd.removerProdutos(quantidade);
		
		System.out.println("Atualização do produto " + pd);
		
		sc.close();
	
	}

}
