package fundamentos_basicos;

/* EXERC�?CIO DE CONVERSÃO DE °F PARA °C
 * 
 * FÓRMULA DE CONVERSÃO DE °F PARA °C ====> °C = (°F − 32) ÷ 9/5
 * 
*/

public class Temperatura {

	public static void main(String[] args) {

		final int numerador = 32;
		final double divisor = 9.0/5;
		double f = 38;
		double c = (f - numerador) / (divisor);

		System.out.println(f + "°F" + " é = " + c + "°C");

	}

}
