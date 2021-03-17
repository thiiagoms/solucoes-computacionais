import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        double notaUm, notaDois, media = 0;
        String situacao = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        notaUm = entrada.nextDouble();

        System.out.print("Segunda nota: ");
        notaDois = entrada.nextDouble();

        media = (notaUm + notaDois) / 2;

        System.out.print(media);
        
        situacao = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("Aluno " + situacao);

        entrada.close();
    }
}
