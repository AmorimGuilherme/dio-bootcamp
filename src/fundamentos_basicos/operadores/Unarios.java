package fundamentos_basicos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++; // a = a + 1;
		a--; // a = a - 1;

		--b; // b = b + 1;
		++b; // b + b - 1;

		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio....");
		System.out.println(++a == b--); // IR� INCREMENTAR +1 na variav�l "a" e "a" ser� =2 e far� a compara��o com b antes de incrementar "b" por causa da precedencia!!
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);

	}

}
