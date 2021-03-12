import java.util.Scanner;

public class Exercicio15 {


    public static void main(String[] args)
    {
        int 
            totalEleitores,
            votosCandidatoUm,
            votosCandidatoDois,
            votosNulos,
            percentualCandidatoUm,
            percentualCandidatoDois,
            percentualNulo = 0;
    
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero total de eleitores: ");
        totalEleitores = entrada.nextInt();

        System.out.print("Total de votos do primeiro candidato: ");
        votosCandidatoUm = entrada.nextInt();

        System.out.print("Total de votos do segundo candidato : ");
        votosCandidatoDois = entrada.nextInt();

        System.out.print("Total de votos nulo: ");
        votosNulos = entrada.nextInt();

        percentualCandidatoUm = (votosCandidatoUm * 100) / totalEleitores;
        percentualCandidatoDois = (votosCandidatoDois * 100) / totalEleitores;
        percentualNulo = (votosNulos * 100) / totalEleitores; 

        System.out.println("Percentual candidato um: " + percentualCandidatoUm + "%");
        System.out.println("Percentual candidato dois: " + percentualCandidatoDois + "%");
        System.out.println("Total de votos nulo: " + percentualNulo + "%");

        entrada.close();
    }
}
