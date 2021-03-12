import java.util.Scanner;

public class Exercicio06 {
    

    public static void main(String[] args)
    {    
        double coefA, coefB, coefC, x1, x2 = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Coeficiente de A: ");
        coefA = entrada.nextDouble();

        System.out.print("Coeficiente de B: ");
        coefB = entrada.nextDouble();

        System.out.print("Coeficiente de C: ");
        coefC = entrada.nextDouble();

        x1 = -coefB + (Math.sqrt(
            (Math.pow(coefB, 2))
            - (4 * coefA * coefC)  
            )
        );

        x2 = -coefB - (Math.sqrt(
            (Math.pow(coefB, 2))
            - (4 * coefA * coefC)  
            )
        );

        System.out.println("Valor de X1: " + x1);
        System.out.println("Valor de X2: " + x2);

        entrada.close();
    }   
}
