/*
 * Imprima somente n�meros m�ltiplos de 15 que s�o pares, de 0 � 1000;
 */
package exercicio2.numero12;

public class Classe {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 1000;
		int divisor = 15;
		
		//Checa se � divisivel por 15 e se o numero � par
		for (int aux = numero1; aux <= numero2; aux++) {
			if ((aux % divisor == 0) && (aux % 2 == 0)) {
				System.out.println(aux);

			}
		}
	}
}
