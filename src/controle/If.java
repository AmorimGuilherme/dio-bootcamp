package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = scan.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Aluno Aprovado!!");
			System.out.println("Parabens!!!!");
		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Aluno em Recuperação!!");

		}
		
		if (media <= 4.5 && media >= 0) {
			System.out.println("Aluno Reprovado!");
			
		}
		
		
		scan.close();

	}

}
