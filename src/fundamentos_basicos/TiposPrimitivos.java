package fundamentos_basicos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Informa??es do funcion?rio
		
		
		// Tipos num?ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 5648;
		long pontosAcumulados = 323615464681L;
		
		// Tipos num?ricos reais
		
		float salario = 11445.45F;
		double vendasAcumuladas = 2991997153.01;
		
		// Tipo booleano
		
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		
		char status = 'A'; // Usado apena aspas simples (apostrofo)
		
		// Dias de empresa
				
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("F?rias?? " + estaDeFerias);
	

	}

};