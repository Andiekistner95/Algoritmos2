/*
 * Perguntar para o usu�rio o in�cio da lista e o final da lista se ele quer que seja
impressa e imprimir esta lista.
 */
package exercicio2.numero20;

import javax.swing.JOptionPane;

public class Classe {

	public static void main(String[] args) {
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inicial"));
		int nfinal = Integer.parseInt(JOptionPane.showInputDialog("Digite numero final"));
		
		// Sim=0 N�o=1 Cancelar=2 (Janela de confirma��o)
		int imprimir = JOptionPane.showConfirmDialog(null, "Deseja imprimir?");
		
		if ( imprimir == 0){
			for(; inicio <= nfinal; inicio++){
				System.out.println(inicio);
			}	
		}
	}
}
