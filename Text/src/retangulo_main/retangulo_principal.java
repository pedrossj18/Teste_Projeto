package retangulo_main;

import java.util.Scanner;
import retangulo_main.Retangulo;

public class retangulo_principal {

	public static void main(String[] args) {
		Retangulo rt = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite base e altura do retangulo:");
		rt.base = sc.nextDouble();
		rt.altura = sc.nextDouble();
		
		System.out.printf("Area = %.2f\n", rt.area());
		System.out.printf("Perimetro = %.2f\n", rt.perimetro());
		System.out.printf("Diagonal = %.2f", rt.diagonal());
	}

}
