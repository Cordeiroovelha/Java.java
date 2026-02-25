// entrada de dados usando a classe Scanner

import java.util.Scanner;

public class EntradaDeDados1{
public static void main(String[] args){
        // instanciar um obj da classe Scanner
		Scanner teclado = new Scanner(System.in);
        int num1, num2, r;
        System.out.print("Numero 1 = ");
        num1 = teclado.nextInt();
        System.out.print("Numero 2 = ");
        num2 = teclado.nextInt();
        
        r = num1 + num2;
        
        System.out.print("Soma = " + r);
        
        //fecha o teclado boa pratica
        teclado.close();
}
}