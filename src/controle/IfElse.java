package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Insira o n�mero: ");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println(numero + " � UM N�MERO PAR");
		} else {
			System.out.println(numero + " � UM N�MERO IMPAR");

		}

	}

}
