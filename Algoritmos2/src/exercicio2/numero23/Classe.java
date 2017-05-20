/*
 * Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
 * Necessitará de 2 for.
11 11 11 11 11 11 11 11 11 11 11
10 10 10 10 10 10 10 10 10 10
09 09 09 09 09 09 09 09 09
08 08 08 08 08 08 08 08
07 07 07 07 07 07 07
06 06 06 06 06 06
05 05 05 05 05
04 04 04 04
03 03 03
02 02
01
 */
package exercicio2.numero23;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {

		int linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de linhas"));
		//controle das linhas
		for (int aux = 0; linhas <= aux; aux--) {
			//controle das colunas
			for (int aux2 = 1; aux2 <= aux; aux2--) {
				
				if (aux < 10) {
					System.out.print("0" + aux + " ");
				} else {
					System.out.print(aux + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
