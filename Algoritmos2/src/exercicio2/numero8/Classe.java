/*
 * Imprima apenas n�mero m�ltiplos de 2, 
 * de 0 at� o n�mero digitado pelo usu�rio;
 */
package exercicio2.numero8;

import javax.swing.JOptionPane;

public class Classe {
public static void main(String[] args) {
	
	int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite at� que n�mero voc� quer imprimir"));
	for (int aux = 0; aux <= quantidade; aux+= 2){
		if(aux % 2 == 0){
			System.out.println(aux);
		}
	}
			
}
}
