package funcionario_main;

public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incremetoSalario(double porcentagem) {
		salarioBruto += salarioBruto * (porcentagem /100);
	}
	
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", salarioLiquido());
	}
}
