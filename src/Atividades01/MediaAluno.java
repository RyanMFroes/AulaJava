package Atividades01;

public class MediaAluno {
    public static void main (String[] args) {

        String Aluno1 = "Pedro";
        String Aluno2 = "Ryan";
        int semestre1 = 1;
        int semestre2= 2;

        double notaPedroSemestre1 = 10.0;
        double notaRyanSemestre1 = 9.0;
        double notaPedroSemestre2 = 8.5;
        double notaRyanSemestre2 = 9.5;

        double mediaPedro = (notaPedroSemestre1 + notaPedroSemestre2) / 2;
        double mediaRyan = (notaRyanSemestre1 + notaRyanSemestre2) / 2;

        System.out.println("Média do Pedro: " + mediaPedro);
        System.out.println("Média do Ryan: " + mediaRyan);

        System.out.println("Média do Pedro arredondada: " + Math.round(mediaPedro));
        System.out.println("Média do Ryan arredondada: " + Math.round(mediaRyan));




    }
}
