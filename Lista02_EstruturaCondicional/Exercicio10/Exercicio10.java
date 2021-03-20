import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        int dia = 0;
        String semana = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um numero entre 1 e 7: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                semana = "Domingo";
                break;
            case 2:
                semana = "Segunda";
                break;
            case 3:
                semana = "Terca";
                break;
            case 4:
                semana = "Quarta";
                break;
            case 5:
                semana = "Quinta";
                break;
            case 6:
                semana = "Sexta";
                break;
            case 7:
                semana = "Sabado";
                break;
            default:
                semana = "Dia desconhecido";
                break;
        }

        System.out.println("Dia da semana: " + semana);
        entrada.close();
    }
}
