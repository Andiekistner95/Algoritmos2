/*
 * Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
 */
package exercicio2.numero12;

public class Classe {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 1000;
		int divisor = 15;
		
		//Checa se é divisivel por 15 e se o numero é par
		for (int aux = numero1; aux <= numero2; aux++) {
			if ((aux % divisor == 0) && (aux % 2 == 0)) {
				System.out.println(aux);

			}
		}
	}
}
