package Exercicios;

import javax.swing.JOptionPane;

public class Senha {
    public static void main(String[] args) {
		int password = 1234;
		int trys = 3;
		int UserTry;
		boolean gotIt = false;
		
		while(trys > 0 && !gotIt) {
			UserTry = Integer.parseInt(JOptionPane.showInputDialog(null, "Tentativa de senha: "));
			if (password == UserTry) {
				JOptionPane.showMessageDialog(null, "Senha correta!");
				gotIt = true;
			} else {
				trys--;
				JOptionPane.showMessageDialog(null, "Senha incorreta, tentativas restantes: " + trys);
			}
		}
		
		if (!gotIt) {
			JOptionPane.showMessageDialog(null, "Sem mais tentativas, tente novamente mais tarde");
		}
	}
}
