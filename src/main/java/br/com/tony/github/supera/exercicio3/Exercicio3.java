package br.com.tony.github.supera.exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        System.out.println("Insira o tamanho do array: ");
        int tamanho = scan.nextInt();
        List<Integer> inteiros = new ArrayList<>();

        System.out.println("Insira o valor alvo: ");
        int valorAlvo = scan.nextInt();

        System.out.println("Insira " + tamanho + " valores: ");
        for (int i = 0; i < tamanho; i++) {
            int valor = scan.nextInt();
            inteiros.add(valor);
        }

        Collections.sort(inteiros);

        for (Integer i : inteiros) {
            for (Integer o : inteiros){
                if (i - o == valorAlvo){
                    contador++;
                }
            }
        }

        System.out.println(contador);
    }
}
