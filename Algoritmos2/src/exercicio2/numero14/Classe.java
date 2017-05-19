/*
 * Imprima somente números que são múltiplos de 100, de -100 à 100;
 */
package exercicio2.numero14;

public class Classe {

	public static void main(String[] args) {

		int nInicial = -100;
		int nFinal = 100;
		int multiplos = 100;

		for (int aux = nInicial; aux <= nFinal; aux++) {
			if (aux % multiplos == 0) {
				System.out.println(aux);
			}
		}
	}
}
