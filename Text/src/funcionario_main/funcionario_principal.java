package funcionario_main;

import java.util.Locale;
import java.util.Scanner;
import funcionario_main.Funcionario;

public class funcionario_principal {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Empregado: " + func);
		
		System.out.print("Porcentagem de imposto a ser adiconado no salario: ");
		double porcentagem = sc.nextDouble();
		func.incremetoSalario(porcentagem);
		
		System.out.println("Empregado: " + func);
		
		sc.close();
		
	}

}
