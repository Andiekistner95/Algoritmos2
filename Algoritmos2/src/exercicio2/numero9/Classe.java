/*
 * Imprima apenas números múltiplos de 3, 
 * até o número digitado pelo usuário;
 */
package exercicio2.numero9;

import javax.swing.JOptionPane;

public class Classe {
	
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Me dê um número"));
		
		for (int aux = 0; aux <= numero; aux++) {
			
			if (aux % 3 == 0) {
				System.out.println(aux);
			}
		}
	}
}
