package br.com.tony.github.supera.exercicio2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat deci = new DecimalFormat("0.00");
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        deci.setDecimalFormatSymbols(symbol);

        System.out.println("Insira o valor desejado: ");
        double valor = scan.nextDouble();
        int resultado;

        List<Integer> notas = new ArrayList<>(Arrays.asList(100, 50, 20, 10, 5, 2));
        List<Double> moedas = new ArrayList<>(Arrays.asList(1.00, 0.50, 0.25, 0.10, 0.05, 0.01));

        System.out.println("Notas: ");
        for ( Integer n : notas) {
            resultado = (int) Math.floor(valor / n);
            System.out.println(resultado + " nota(s) de R$ " + n + ".00 ");
            valor %= n;
        }

        System.out.println("Moedas: ");
        for (Double m : moedas) {
            resultado = (int) (valor / m);
            System.out.println(resultado + " moeda(s) de R$ " + deci.format(m));
            valor %= m;
        }

    }
}
