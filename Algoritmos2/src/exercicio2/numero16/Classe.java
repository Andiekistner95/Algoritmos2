/*
 * Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;
 */
package exercicio2.numero16;

public class Classe {

	public static void main(String[] args) {

		int nInicial = 10;
		int nFinal = 1000;
		int divisor = 5;
		int maiorque3 = 3;

		for (int aux = nInicial; aux <= nFinal; aux++) {
			if (aux / divisor > maiorque3) {
				System.out.println(aux);

			}
		}
	}
}
