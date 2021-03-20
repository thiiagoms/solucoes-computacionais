import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        double peso, altura, imc = 0;
        String condicao = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        altura = entrada.nextFloat();

        System.out.print("Informe o peso: ");
        peso = entrada.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 20) {
            condicao = "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            condicao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            condicao = "Sobre peso";
        } else if (imc >= 30 && imc < 40) {
            condicao = "Obeso";
        } else {
            condicao = "Obeso Morbido";
        }

        System.out.println(condicao);

        entrada.close();
    }
}
