package aulas.aula13;

import java.util.Scanner;
//Faça um programa que calcule a velocidade de download de um arquivo

public class VelocidadeDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo que deseja baixar em Megas: ");
        double tamanho = scanner.nextDouble();
        System.out.printf("Ok, %.2fMB é o peso do arquivo.", tamanho);
        System.out.println("");
        System.out.println("\nDigite a velocidade da internet em MegaBytes por segundo: ");
        double velocidade = scanner.nextDouble();
        System.out.printf("Ok, %.2fMBps é a velocidade da internet.", velocidade);
        System.out.println("");

        double tempoAproximado = tempoMinutos(tamanho, velocidade);
        System.out.printf("O tempo aproximado de download será %.2f minutos.", tempoAproximado);

    }
        public static double tempoMinutos(double tamanho, double velocidade){
            return (tamanho/velocidade)/60;
        }

}
