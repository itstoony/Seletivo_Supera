package br.com.tony.github.supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int n;
        int qtd;
        List<Integer> listaInicial = new ArrayList<>();
        List<Integer> listaFinal = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de números desejada: ");
        qtd = scan.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Insira o " + i + "° número: ");
            n = scan.nextInt();

            while (!(n > 1 && n <= Math.pow(10, 5))) {
                System.out.println("Número deve ser maior que 1 e menor ou igual a 100.000");
                n = scan.nextInt();
            }
            listaInicial.add(n);
        }

        List<Integer> par = new ArrayList<>(listaInicial.stream().filter(p -> p % 2 == 0).toList());
        Collections.sort(par);

        List<Integer> impar = new ArrayList<>(listaInicial.stream().filter(p -> p % 2 != 0).toList());
        Collections.reverse(impar);

        listaFinal.addAll(par);
        listaFinal.addAll(impar);

        System.out.println(listaFinal);
    }
}
