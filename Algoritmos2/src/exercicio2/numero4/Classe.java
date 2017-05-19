/*
 * Imprima no console uma lista de 0 a 20 e de 30 a 40, utilizando apenas um for
 */
package exercicio2.numero4;

public class Classe {
public static void main(String[] args) {
	
	int quantidade = 40;
	
	for (int aux = 0; aux <= quantidade; aux++) {
		if ( (aux <= 20 ) || (aux >= 30)){
			System.out.println(aux);
		}
	}
}
}
