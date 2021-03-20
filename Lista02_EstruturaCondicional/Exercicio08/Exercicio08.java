import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        int idade;
        String categoria = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade <= 7)
            categoria = "Infantil";
        else if (idade >= 8 && idade <= 10)
            categoria = "Juvenil";
        else if (idade >= 11 && idade <= 15)
            categoria = "Adolescente";
        else if (idade >= 16 && idade <= 30)
            categoria = "Adulto";
        else
            categoria = "Senior";

        System.out.println("Sua categoria: " + categoria);
        entrada.close();
    }
}
