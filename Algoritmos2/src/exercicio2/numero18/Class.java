/*
 * Imprimir uma lista com as 10 primeiras letras do alfabeto:
A
B
C
D
E
F
G
H
I
J
 */
package exercicio2.numero18;

public class Class {

	public static void main(String[] args) {
		//inicio do contador até o numero max de letras
		int contador = 1;
		int qntLetras = 10;
		
		//Define intervalo da letra A até Z, imprime e depois incrementa o contador 
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			if (contador <= qntLetras) {

				System.out.println(letra);
			}
			contador++;
		}
	}
}
