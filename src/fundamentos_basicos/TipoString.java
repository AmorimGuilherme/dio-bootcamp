package fundamentos_basicos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ol? pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa "));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));

		var nome = "Guilherme";
		var sobrenome = "Amorim";
		var idade = 23;
		var salario = 2154.987;

		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + " anos" +
				"\nSal?rio: " + salario);
		
		System.out.printf("O %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);

	}

}
