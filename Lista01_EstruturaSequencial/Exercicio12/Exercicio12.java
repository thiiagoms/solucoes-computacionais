import java.util.Scanner;

public class Exercicio12 {

    
    public static void main(String[] args)
    {
        double altura, imc = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        imc = (72.7 * altura) - 58;
    
        System.out.println("IMC: " + imc);

        entrada.close();
    }

}
