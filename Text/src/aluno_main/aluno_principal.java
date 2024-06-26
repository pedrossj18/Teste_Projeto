package aluno_main;

import java.util.Scanner;
import aluno_main.Aluno;

public class aluno_principal {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Nome: ");
		al.nome = sc.nextLine();
		
		al.n1 = sc.nextDouble();
		al.n2 = sc.nextDouble();
		al.n3 = sc.nextDouble();
		
		System.out.println("Nota Final = " + al.notaFinal());
		
		if(al.notaFinal() > 60.0) {
			System.out.println("PASS");
		}
		else if (al.notaFinal() < 60.0){
			System.out.println("NO PASS");
			System.out.printf("Faltam %.2f ponto(s)", al.mediaFinal());
		}
		sc.close();
	}

}
