package br.senai.sp.sistema;

import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {

        /** Import Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta de dados */
        System.out.println("--------------------------");
        System.out.println("Digite o nome do Professor");
        String nomeprof = teclado.nextLine();

        System.out.println("Digite o nome do aluno");
        String nomealun = teclado.nextLine();

        System.out.println("Digite o nome do curso");
        String nomecurs = teclado.nextLine();

        System.out.println("Digite a frequencia do aluno");
        int frequencia = teclado.nextInt();

        int [] nota = new int[2];

        System.out.println("Digite a 1º nota do aluno");
        nota[0] = teclado.nextInt();

        System.out.println("Digite a 2º nota do aluno");
        nota[1] = teclado.nextInt();

        float media = (nota[0] + nota[1]) / 2;

        boolean validacao = false;

        while (!validacao) {
            if (frequencia >= 75 && media >= 7 || frequencia >= 90 && media >= 6) {
                validacao = true;
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
