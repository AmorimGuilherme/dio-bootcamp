package fundamentos_basicos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner scan = new Scanner(System.in);
		
		String s2 = scan.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		scan.close();
	

	}

}
