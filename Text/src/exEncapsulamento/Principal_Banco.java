package exEncapsulamento;

import java.util.Scanner;
import exEncapsulamento.Conta;

public class Principal_Banco {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Bem vindo ao Banco !");
			System.out.print("Insira o numero da conta: ");
			int numero_conta = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Insira o nome do titular da conta: ");
			String nome = sc.nextLine();
			
			Conta conta = new Conta(numero_conta, nome);
			
			conta.dados_deposito();
			
			System.out.println(conta);
			conta.deposito();
			System.out.println(conta);
			conta.saque();
			System.out.println(conta);
			
			sc.close();
			
	}

}
