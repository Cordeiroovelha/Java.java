// entrada de dados usando a classe JOptionPane

import javax.swing.JOptionPane;

public class EntradaDeDados2 {
    public static void main(String[] args) {
		int num1, num2, r;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		r = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Soma = " + r);

	}
}
