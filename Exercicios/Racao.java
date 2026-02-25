// exercicio de calculo para saber quanto de ração resta depois de 5 dias

package Exercicios;

import java.util.Scanner;

public class Racao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float racao, gato1, gato2, r;
		
		System.out.print("Quantas gramas tem o saco de ração ..........: ");
		racao = teclado.nextFloat();
		System.out.println();
		System.out.print("Quantas gramas o primeiro gato come por dia .: ");
		gato1 = teclado.nextFloat();
		System.out.print("Quantas gramas o segundo gato come por dia ..: ");
		gato2 = teclado.nextFloat();
		System.out.println();
		
		r = racao - ((gato1 * 5) + (gato2 * 5));
		
		System.out.println("Depois de 5 dias restaram " + r + " gramas de ração");
		
		teclado.close();
		
	}

}
