package com.example;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        
        double rupees = 1000;
        double dollars = 50;
        
        System.out.println("--- Currency Conversion Results ---");
        System.out.printf("%.2f Rupee = %.2f Dollar\n", rupees, converter.rupeeToDollar(rupees));
        System.out.printf("%.2f Dollar = %.2f Rupee\n", dollars, converter.dollarToRupee(dollars));
        System.out.printf("%.2f Rupee = %.2f Euro\n", rupees, converter.rupeeToEuro(rupees));
        System.out.println("-----------------------------------");
    }
}
