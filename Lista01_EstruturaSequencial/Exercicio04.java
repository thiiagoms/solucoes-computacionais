import java.util.Scanner;


public class Exercicio04
{

    
    public static void main(String[] args)
    {
        double area, diagonalMaior, diagonalMenor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Diagonal maior: ");
        diagonalMaior = entrada.nextDouble();

        System.out.print("Diagonal menor: ");
        diagonalMenor = entrada.nextDouble();

        entrada.close();

        area = (diagonalMaior * diagonalMenor) / 2;

        System.out.print("Valor da area: " + area + "\n");

        entrada.close();
    }
}