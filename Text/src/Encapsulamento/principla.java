package Encapsulamento;

import java.util.Scanner;

import Encapsulamento.Produto;

public class principla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		Produto pd = new Produto(nome, preco);
		
		pd.setnome("Computador");
		System.out.println("Update name: " + pd.getnome());
		
		pd.setpreco(1200.00);
		System.out.println("Update preço: " + pd.getpreco());

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
