package fundamentos_basicos;

import java.util.Scanner; 

public class Console {

	public static void main(String[] args) {

		System.out.println("Bom");  
		System.out.println(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 34, 43, 23, 54, 34);
		System.out.printf("Sal?rio: %.1f%n", 2458.458);
		System.out.printf("Nome: %s%n", "Guilherme");

		Scanner teclado = new Scanner(System.in);

		System.out.println("\nDigite o seu nome: ");
		String nome = teclado.nextLine();
		;

		System.out.println("\nDigite o seu sobrenome: ");
		String sobrenome = teclado.nextLine();

		System.out.println("\nDigite a sua idade: ");
		int idade = teclado.nextInt();

		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		teclado.close();

	}

}
