package fundamentos_basicos;

public class Interferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto"; // n?o ? poss?vel sobrescrever o tipo da v
		System.out.println(c);
		
		double d; // vari?vel foi declarada
		d = 154.58; // vari?vel foi inicializada
		System.out.println(d); // vari?vel foi usada
	}

}
