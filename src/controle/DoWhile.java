package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Você precisa dizer as palavras mágicas\n");
			System.out.println("Digite a palavra mágica: \n");
			texto = entrada.nextLine();

		} while (!"por favor".equalsIgnoreCase(texto));
		
		System.out.println("Você disse as palavras mágicas: ---> Por favor!");
		
		entrada.close();

	}

}
