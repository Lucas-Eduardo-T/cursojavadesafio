package aulas.aula13;

import java.util.Scanner;
// informe um número para que ele seja mostrado na tela.
public class NumeroInformado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O número digitado é: " + numero);
    }
}
