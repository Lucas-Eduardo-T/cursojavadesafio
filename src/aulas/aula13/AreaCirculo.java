package aulas.aula13;
import java.util.InputMismatchException;
import java.util.Scanner;

//faça um programa que peça o raio de um círculo, calcule e mostre sua área.

public class AreaCirculo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            final double PI = 3.14;
            System.out.println("Digite um valor em metros que será o raio de um círculo para " +
                    "descobrir a área do círculo em metros quadrados.");
            double num = scanner.nextInt();
            double areaCircular = area(PI, num);
            System.out.printf("A área de um círculo com raio de %.2fm é aproximadamente %.2fm².", num, areaCircular);
            System.out.println("\nOBS: o valor de PI foi considerado 3,14 por motivos de: simplificação da conta.");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado não corresponde a um número racional, " +
                    "portanto o programa será encerrado.");;
                    return;
        }
    }

    private static double area(final double PI, double num){
        return (PI * num * num);

    }
}
