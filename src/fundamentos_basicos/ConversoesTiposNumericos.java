package fundamentos_basicos;

public class ConversoesTiposNumericos {

	public static void main(String[] args) {
		double a = 1; // Convers�o implicita 
		System.out.println(a);

		float b = (float) 1.0224; // Convers�o explicita (ciente de poss�vel perda do valor inicial)
		System.out.println(b);

		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
		
		

	}

}
