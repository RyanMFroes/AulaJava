package Aula03;

public class AulaJava04 {
        public static void main(String[] args) {

                int idade = 23;
                String nome = "ryan";
                double altura = 1.75;
                char sexo  = 'm';
                boolean amigavel = true;
                char primeiraletranome  = 'r';
                char faculdade = 's';



                        System.out.println("meu nome é:" + nome);
                        System.out.println("minha idade é:" + idade);
                        System.out.println("meu sexo é:" + sexo);
                        System.out.println("minha altura é" + altura);
                        System.out.println("é amigavel?:" + amigavel);
                        System.out.println("qual a primeira letra do nome?:" + primeiraletranome);
                        System.out.println("faz faculdade?:" + faculdade);

                /// ...aula 01 \/  \/  \/  \/  \/



                int a = 10;
                int b = 5;
                boolean condicao1 = (a > 8);  //true
                boolean condicao2 = (b < 3);  //false


                //Aritméticos
                        System.out.println("a + b =" + (a + b));  //15
                        System.out.println("a - b =" + (a - b));  //5
                        System.out.println("a . b =" + (a * b));  //50
                        System.out.println("a / b =" + (a / b));  //2

                //Comparação
                        System.out.println("a maior que b =" + (a > b));  //true
                        System.out.println("a igual b =" + (a == b));   // false

                //Lógicos
                        System.out.println("condicao1 é igual a condicao2:" + (condicao1 && condicao2)); //false
                        System.out.println("uma das condicoes é verdadeira?:" + (condicao1 || condicao2));  // true
                        System.out.println("!condicao1:" + (!condicao1)); //false

        }
}