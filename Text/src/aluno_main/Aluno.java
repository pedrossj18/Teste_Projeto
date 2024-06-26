package aluno_main;

public class Aluno {
	
	String nome;
	double n1;
	double n2;
	double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	public double mediaFinal() {
		if(notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
}