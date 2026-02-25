package Exercicios;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double Wage, Raise = 0, NewSalary;
		
		System.out.print("Informe o salario: ");
		Wage = teclado.nextDouble();
		
		if ((Wage > 300) && (Wage <= 600)) {
			Raise = Wage * 0.02;
		} else {
			if (Wage <= 300) {
				Raise = Wage * 0.03;
			} else {
				Raise = Wage * 0.05;
			}
		}
		
		NewSalary = Wage + Raise;
		
		System.out.println("Novo salario: " + NewSalary);
		
		teclado.close();
	}
}
