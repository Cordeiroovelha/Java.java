// exercicio de calculo necessario para lucro

package Exercicios;

import javax.swing.JOptionPane;

public class Teatro {
    	public static void main(String[] args) {
		int custo, ingresso, venda;
		
		custo = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto custa o espetaculo ..: "));
		ingresso = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto custa cada ingresso .: "));
		
		venda = (custo/ingresso) + 1;
		
		JOptionPane.showMessageDialog(null, "precisão ser vendidos " + venda + " para haver lucro");
		
	}

}
