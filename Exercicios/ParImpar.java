package Exercicios;
import javax.swing.JOptionPane;

public class ParImpar {
    public static void main(String[] argc) {
		int num1;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
		
		if (num1 % 2 == 0) {
			JOptionPane.showConfirmDialog(null, "O numero é par");
		}	
		else {
			JOptionPane.showConfirmDialog(null, "O numero é impar");
		}
	}
}
