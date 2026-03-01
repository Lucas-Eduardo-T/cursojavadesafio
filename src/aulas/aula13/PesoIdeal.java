package aulas.aula13;
import java.util.InputMismatchException;
import java.util.Scanner;
//Tendo como dados de entrada a altura de uma pessoa, construa
// um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7 * altura) - 58

public class PesoIdeal {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a sua altura para saber qual seu peso ideal: ");
            double altura = scanner.nextDouble();
            double peso = calculoPeso(altura);
            if(altura < 1.20){
                System.out.println("O peso pra quem tem menos de 1,20m de altura provavelmente " +
                        "está errado e não será mostrado.");
                return;
            }
            System.out.printf("O peso ideal de alguem que tem %.2fm de altura é %.2fkg.", altura, peso);
            System.out.println("\nOBS: Valor médio que não leva em conta variáveis.");
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado não é reconhecido como um número, " +
                    "portanto o programa será encerrado");
            return;
        }
    }

    public static double calculoPeso(double altura){
        return ((72.7 * altura) - 52);
    }
}
