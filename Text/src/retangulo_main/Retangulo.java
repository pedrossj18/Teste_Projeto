package retangulo_main;

public class Retangulo {
	
	double base;
	double altura;
	
	public double area() {
		return base * altura;
	}
	public double perimetro() {
		return 2 *(base + altura); // P=2(b+h).
	}
	public double diagonal() {
		return Math.sqrt(base * base + altura * altura);
	}
}
