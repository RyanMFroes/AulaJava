package Aula03;

public class AulaJava02 {

    public static void main(String[] args) {


        // Teste de potenciação
        double base = 6;
        double expoente = 3;
            System.out.println("1. potenciação");
            System.out.println(base + " elevado á " + expoente + " é: " + Math.pow(base, expoente));

        //valor absoluto de um numero negativo
        int negativo = -10;
            System.out.println("\n2. Valor absoluto:");
            System.out.println("O valor absoluto de " + negativo + " é: " + Math.abs(negativo));

        int a = 7, b = 15;
            System.out.println("\n3. Maior valor:");
            System.out.println("O maior entre " + a + " e " + b + " é: " + Math.max(a, b));

            System.out.println("\n4. Menor valor:");
            System.out.println("O menor entre " + a + " e " + b + " é: " + Math.min(a, b));

        double valor = 3.5;
            System.out.println("\n5. Arredondamento:");
            System.out.println("Arredondando " + valor + ": " + Math.round(valor));

            System.out.println("\n6. Número aleatório:");
        double aleatorio = Math.random() * 100;
            System.out.println("Número aleatório entre 0 e 100: " + aleatorio + " " + String.format("%.3f", aleatorio));




    }
}
