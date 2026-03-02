package Exercicios;

import javax.swing.JOptionPane;

public class QuatroEstaçoes {
    public static void main(String[] args) {
    
    String mouth;
    
    mouth = JOptionPane.showInputDialog(null, "Qual o mes voce quer buscar?");
    
    switch (mouth) {
        case "janeiro", "fevereiro", "dezembro" -> 
            JOptionPane.showMessageDialog(null, "Verão");
            
        case "março", "abril", "maio" -> 
            JOptionPane.showMessageDialog(null, "outono");
            
        case "junho", "julho", "agosto" -> 
            JOptionPane.showMessageDialog(null, "inverno");
            
        case "setembro", "outubro", "novembro" -> 
            JOptionPane.showMessageDialog(null, "primavera");
            
        default -> 
            JOptionPane.showMessageDialog(null, "escrito errado ou mes invalido");
    }
}	
	}
}
