package fundamentos_basicos.operadores;

import java.util.Scanner;

public class Relacionais {
	
	public static void main(String[] args) {
		
			System.out.println(3 > 4);
			System.out.println(3 >= 4);
			System.out.println(3 < 4);
			System.out.println(3 <= 4);
			System.out.println(3 != 4);
			
			// Exercitando
			
			double nota;
			boolean bomComportamento = true;
			
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Digite a nota do aluno: ");
			nota = scan.nextDouble();
			
			boolean aprovado = nota >= 7 && bomComportamento;
			
			System.out.println("Aluno aprovado? " + aprovado);
			
			scan.close();
			
			
			
			
			
			
	}

}
