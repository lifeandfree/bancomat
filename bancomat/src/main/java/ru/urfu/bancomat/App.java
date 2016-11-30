package ru.urfu.bancomat;

import java.util.Scanner;

import ru.urfu.bancomat.banknote.CurrencyType;

public class App {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(CurrencyType.Dollar);
        while (true) {
            int quantity = 0;
            System.out.println("Enter quantity to cash out");
            Scanner input = new Scanner(System.in);
            quantity = input.nextInt();
            // if (quantity % 10 != 0) {
            // System.out.println("Quantity should be in multiple of 10.");
            // return;
            // }
            bancomat.getMakeCash(quantity);
        }
    }
}
