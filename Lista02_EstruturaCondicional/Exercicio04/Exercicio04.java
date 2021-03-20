import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {

        double valorX, valorY, valorZ = 0;
        String mensagem = ""; // Apenas pra usar o comando Sytem.out.print uma unica vez
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor de X: ");
        valorX = entrada.nextDouble();

        System.out.print("Valor de Y: ");
        valorY = entrada.nextDouble();

        System.out.print("Valor de Z: ");
        valorZ = entrada.nextDouble();


        if (valorX + valorY > valorZ &&
            valorX + valorZ > valorY &&
            valorY + valorZ > valorX
        ) {
            mensagem = "Formam triangulo";
        } else {
            mensagem = "Nao formam um triangulo";
        }

        System.out.println(mensagem);

        entrada.close();
    }
}
