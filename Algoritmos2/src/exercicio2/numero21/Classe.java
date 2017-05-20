/*
 * Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
 * Necessitará de 2 for.
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
1 1 1 1 1 1
 */
package exercicio2.numero21;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {

		int qntLinhas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de linhas"));

		for (int aux = 0; aux <= qntLinhas; aux++) {
			for (int aux2 = 0; aux2 <= aux; aux2++) {
				System.out.print("1 ");
				// print continua na mesma linha
				//println pula uma linha
			}
			System.out.println(" ");
		}
	}
}
