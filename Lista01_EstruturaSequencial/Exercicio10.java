import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args)
    {    
        double gorgeta, conta;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Total da conta: ");
        conta = entrada.nextDouble();

        gorgeta = conta * 10 / 100;
        
        System.out.println("Valor da gorgeta para o gargom: R$ " + gorgeta);

        entrada.close();
    }
}
