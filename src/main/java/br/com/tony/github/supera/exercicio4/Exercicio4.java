package br.com.tony.github.supera.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String frase = lerLinha(scan);
            StringBuilder frase1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder frase2 = new StringBuilder(frase.substring(frase.length() / 2));

            frase1.reverse();
            frase2.reverse();

            System.out.println(frase1 + frase2.toString());
        }
    }

    public static String lerLinha(Scanner scan) {
        String frase = scan.nextLine();
        while (frase.isEmpty())
            frase = scan.nextLine();
        return frase;
    }

}
