/*
 * Pergunte para o usuário até que número ele quer imprimir, 
 * e imprima do 0 até o número desejado pelo usuário
 */
package exercicio2.numero5;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite até que número você quer imprimir."));

		for (int aux = 0; aux <= quantidade; aux++) {
			System.out.println(aux);
		}

	}
}
