/*
 * Imprima apenas n�meros do qual a divis�o por 3, retorne um n�mero inteiro, de -10 � 500;
 */
package exercicio2.numero15;

public class Classe {

	public static void main(String[] args) {

		int nInicial = -10;
		int nFinal = 500;
		int divisor = 3;

		for (int aux = nInicial; aux <= nFinal; aux++) {
			if (aux % divisor == 0) {
				System.out.println(aux);
			}
		}
	}
}
