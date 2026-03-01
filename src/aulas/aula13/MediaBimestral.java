package aulas.aula13;

import java.util.ArrayList;
import java.util.Scanner;
// Faça um programa que peça as 4 notas bimestrais e mostre a média.
public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double somatorio = 0;
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) + "ª nota. ");
            notas[i] = scanner.nextDouble();
            somatorio += notas[i];
        }
        double notaMedia = mediaNotas(somatorio);
        System.out.printf("A média é igual a %.2f", notaMedia);
    }

    public static double mediaNotas(double somatorio){
        return (somatorio/4);
    }

}
