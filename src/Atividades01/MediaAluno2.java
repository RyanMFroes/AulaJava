package Atividades01;

import java.util.Scanner;

public class MediaAluno2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o nome do aluno: " );
        String nome = scanner.nextLine();
        System.out.println("bem vindo: " + nome );
        System.out.println("digite sua nota do 1ª semestre: ");
        double n1 = scanner.nextDouble();
        System.out.println("digite sua nota do 2ª semestre: ");
        double n2 = scanner.nextDouble();
        System.out.println("digite sua nota do 3ª semestre: ");
        double n3 = scanner.nextDouble();
        System.out.println("digite sua nota do 4ª semestre: ");
        double n4 = scanner.nextDouble();
        System.out.println("digite sua nota do 5ª semestre: ");
        double n5 = scanner.nextDouble();
        System.out.println("digite sua nota do 6ª semestre: ");
        double n6 = scanner.nextDouble();
        System.out.println("digite sua nota do 7ª semestre: ");
        double n7 = scanner.nextDouble();
        System.out.println("digite sua nota do 8ª semestre: ");
        double n8 = scanner.nextDouble();

        double media =(n1 + n2 + n3 + n4 + n5 + n6+ n7+ n8) / 8;

        System.out.println("sua media foi de: " + media);

        if (media >=6){
            System.out.println("parabéns, voce está aprovado");

        } else{
            System.out.println("reprovado");
        }
    }
}
