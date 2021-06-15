package com.company;

import java.text.DecimalFormat;

import java.util.Scanner;

public class aaa {

    public static void definições(){
        int alunos = 0, notas = 0;
        double notaAprovação = 0;
        System.out.print("Quantos alunos deseja calcular a média? ");
        Scanner scanner = new Scanner(System.in);
        alunos = scanner.nextInt();
        alunos = alunos+1;
        System.out.print("Quantas notas serão contadas por aluno? ");
        scanner = new Scanner(System.in);
        notas = scanner.nextInt();
        notas = notas+1;
        System.out.print("Qual a nota minima para aprovação? ");
        scanner = new Scanner(System.in);
        notaAprovação = scanner.nextDouble();
        médias(alunos,notas, notaAprovação);
    }


    public static void médias(int alunos, int notas, double NA){
        double vetor[][] = new double[alunos][notas];
        double mediaGeral[] = new double [alunos];
        for (int contalunos = 1; contalunos < alunos; contalunos++) {
            System.out.println("\nAluno " + contalunos);
            double média = 0;
            for(int contnotas = 1; contnotas < notas; contnotas++) {
                System.out.print("Digite sua nota no " + contnotas + "° bimestre: ");
                Scanner scanner = new Scanner(System.in);
                vetor[contalunos][contnotas] = scanner.nextDouble();
            }
            for (int n = 1; n < notas; n++) {
                média = média + vetor[contalunos][n];
            }
            média = média/(notas-1);
            mediaGeral[contalunos] = média;
        }
        prints(alunos, mediaGeral, NA);
    }




    public static void prints(int alunos, double mediaGeral[], double notaAprovação){
        System.out.println("\n\n\nA média anual dos alunos foi: ");
        DecimalFormat deci = new DecimalFormat("0.00");
        for(int n= 1; n < alunos; n++){
            if(mediaGeral[n] >= notaAprovação) {
                System.out.println("\nAluno " + n + ", média: " + (deci.format(mediaGeral[n])) + "\n Status: Aprovado");
            }
            else {
                System.out.println("\nAluno " + n + ", média: " + (deci.format(mediaGeral[n])) + "\n Status: Reprovado");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        definições();
    }
}