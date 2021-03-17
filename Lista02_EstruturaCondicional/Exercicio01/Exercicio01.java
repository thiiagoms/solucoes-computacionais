import java.util.Scanner;

class Exercicio01 {

    public static void main(String[] args) {

        double numeroUm, numeroDois = 0;
        String mensagem = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        numeroUm = entrada.nextDouble();

        System.out.print("Informe o segundo numero: ");
        numeroDois = entrada.nextDouble();

        if (numeroUm > numeroDois) {
            mensagem =  "Maior: " + numeroUm + "\nMenor: " + numeroDois;
        } else if (numeroUm < numeroDois) {
            mensagem = "Maior: "+ numeroDois + "\nMenor: " + numeroUm;
        } else {
            mensagem = "Numero Um: " + numeroUm + " e Numero Dois: " + numeroDois + " sao iguais!";
        }

        System.out.println(mensagem);

        entrada.close();
    }
}