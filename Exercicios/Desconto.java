package Exercicios;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        double price;

        System.out.println("Qual o preço do produto? ");
        price = keybord.nextDouble();

        if (price >= 500)
            System.out.println("O preço depois do desconto é: " + price * 0.85);
        else
            System.out.println("O preço não possui desconto: " + price);

        keybord.close();
    }
}
