/*
 * Imprima apenas números múltiplos de 97 de 0 à 1000;
 */
package exercicio2.numero11;

public class Classe {

	public static void main(String[] args) {

		int numeroInicial = 0;
		int numeroFinal = 1000;
		int divisor = 97;

		for (int aux = numeroInicial; aux <= numeroFinal; aux++) {
			if (aux % divisor == 0) {
				System.out.println(aux);

			}
		}
	}
}
