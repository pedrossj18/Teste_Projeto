package exEcamcapsulamentoOk;

public class Conta {
	
	private int numero_conta;
	private String nome;
	private double deposito_inicial;
	
	
	public Conta(int numero_conta, String nome) {
		this.numero_conta = numero_conta;
		this.nome = nome;
	}

	public Conta(int numero_conta, String nome, double deposito_inicial) {
		this.numero_conta = numero_conta;
		this.nome = nome;
		deposito(deposito_inicial);
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito_inicial() {
		return deposito_inicial;
	}
	public void deposito(double deposito) {
		deposito_inicial += deposito;
	}
	public void saque(double deposito) {
		deposito_inicial -= deposito + 5.0;
	}
	public String toString() {
		return "\nDados da conta:\n"
				+ "Conta "
				+ numero_conta
				+ ", Titular da conta: "
				+ nome
				+ ", Valor na Conta: $ "
				+ String.format("%.2f", deposito_inicial);
	}
}
