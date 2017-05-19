/*
 * Imprima somente números divisíveis por 5, de 1000 à 0;
 */
package exercicio2.numero13;

public class Classe {

	public static void main(String[] args) {

		int inicial = 1000;
		int finalle = 0;
		int divisor = 5;
		//Decrementar de 1000 a 0 (aux--)
		for (int aux = inicial; aux >= finalle; aux--) {
			if (aux % divisor == 0) {
				System.out.println(aux);
			}
		}
	}
}
