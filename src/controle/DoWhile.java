package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Voc� precisa dizer as palavras m�gicas\n");
			System.out.println("Digite a palavra m�gica: \n");
			texto = entrada.nextLine();

		} while (!"por favor".equalsIgnoreCase(texto));
		
		System.out.println("Voc� disse as palavras m�gicas: ---> Por favor!");
		
		entrada.close();

	}

}
