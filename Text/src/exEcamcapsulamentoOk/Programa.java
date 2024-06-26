package exEcamcapsulamentoOk;

import java.util.Locale;
import java.util.Scanner;
import exEcamcapsulamentoOk.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Bem vindo ao Banco !");
		System.out.print("Insira o numero da conta: ");
		int numero_conta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Insira o nome do titular da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor inicial será depositado (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Insira a valor de deposito: ");
			double valor_deposito = sc.nextDouble();
			conta = new Conta(numero_conta, nome, valor_deposito);
		} 
		else {
			conta = new Conta(numero_conta, nome);
		}
		System.out.println();
		System.out.println("Atualizaão");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Realizar um depossito:");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Atualizaão de conta:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("REalizar um saque:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Atualizaão de conta:");
		System.out.println(conta);
		
		sc.close();
	}

}