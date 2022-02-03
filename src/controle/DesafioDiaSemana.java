package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do dia: ");
		String dia = scan.next();

		if (dia.equalsIgnoreCase("DOMINGO")) {
			System.out.println(1);

		} else if (dia.equalsIgnoreCase("SEGUNDA")) {
			System.out.println(2);

		} else if (dia.equalsIgnoreCase("TERÇA") || dia.equalsIgnoreCase("TERCA")) {
			System.out.println(3);

		} else if (dia.equalsIgnoreCase("QUARTA")) {
			System.out.println(4);

		} else if (dia.equalsIgnoreCase("QUINTA")) {
			System.out.println(5);

		} else if (dia.equalsIgnoreCase("SEXTA")) {
			System.out.println(6);

		} else if (dia.equalsIgnoreCase("SÁBADO") || dia.equalsIgnoreCase("SABADO")) {
			System.out.println(7);

		} else {
			System.out.println("Digite um dia válido!!");

		}
	}

}
