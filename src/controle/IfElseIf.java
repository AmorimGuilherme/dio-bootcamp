package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inv�lida");
		} else if (nota >= 7) {
			System.out.println("BOM");
		} else if (nota >= 5) {
			System.out.println("REGULAR");
		} else if (nota >= 3) {
			System.out.println("RUIM");
		} else if (nota >= 0) {
			System.out.println("P�SSIMO");

		}

		entrada.close();

	}

}
