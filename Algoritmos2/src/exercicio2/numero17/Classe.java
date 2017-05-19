/*
 * Imprimir uma lista semelhante a lista abaixo:

1_10
2_9
3_8
4_7
5_6
6_5
7_4
8_3
9_2
10_1
 */
package exercicio2.numero17;

public class Classe {

	public static void main(String[] args) {
		
		int nInicial = 1;
		int nFinal = 10;
		int nFinal2 = nFinal;
		
		for (int aux = nInicial; aux <= nFinal; aux++){
			System.out.println(aux + "_" + nFinal2);
			nFinal2--;
			
		}
	}
}
