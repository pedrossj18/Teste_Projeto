package exEncapsulamento;

import java.util.Scanner;

public class Conta {

	private Scanner sc = new Scanner(System.in);

	private int numero_conta;
	private String nome;
	private double valor_deposito;
	private double deposito;
	private double saque;
	
	public Conta(int numero_conta, String nome) {
		this.numero_conta = numero_conta;
		this.nome = nome;
		this.valor_deposito = 0;
		this.sc = new Scanner(System.in);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void dados_deposito() {
		System.out.print("Valor inicial será depositado (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Insira a valor de deposito: ");
			valor_deposito = sc.nextDouble();
		} else if (resposta == 'n') {
			System.out.println("Valor do deposito: " + valor_deposito);
		}
	}
	
	public void addDeposito(double deposito) {
		this.valor_deposito = valor_deposito + deposito;
	}
	public void deposito() {
		System.out.print("\nInsira um valor de deposito: ");
		this.deposito = sc.nextDouble();
		addDeposito(deposito);
		System.out.println("Atualização de conta:");
	}
	
	public void addSaque(double saque) {
		this.valor_deposito = valor_deposito - saque - 5;
	}
	public void saque() {
		System.out.printf("\nInsira um valor de saque: ");
		this.saque = sc.nextDouble();
		addSaque(saque);
		System.out.println("Atualização de conta:");
	}

	public String toString() {
		return "\nDados da conta:\n"
				+ "Conta "
				+ numero_conta
				+ ", Titular da conta: "
				+ nome
				+ ", Valor na Conta: $ "
				+ String.format("%.2f", valor_deposito);
	}
}
