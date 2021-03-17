import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        double notaUm, notaDois, notaTres, media = 0;
        String statusAluno = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        notaUm = entrada.nextDouble();

        System.out.print("Informa a segunda nota: ");
        notaDois = entrada.nextDouble();

        System.out.print("Informe a terceira nota: ");
        notaTres = entrada.nextDouble();

        media = (notaUm + notaDois + notaTres) / 3;

        if (media >= 0 && media < 3) {
            statusAluno = "REPROVADO";
        } else if (media >= 3 && media < 7) {
            statusAluno = "EXAME";
        } else if (media >= 7 && media <= 10) {
            statusAluno = "APROVADO";
        } else {
            // Se a media for maior que 10. Ex: 11,12,13...
            statusAluno = "Desconhecido";
        }

        System.out.print(statusAluno);

        entrada.close();
    }
}