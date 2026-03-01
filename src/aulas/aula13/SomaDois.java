package aulas.aula13;

import java.util.Scanner;
// Peça para o usuário digitar dois números e some-os.
public class SomaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = scanner.nextInt();

        int valoresSomados = somaNumeros(num1, num2);
        System.out.println("A soma dos valores " + num1 + " e " + num2 +  " é igual a: " + valoresSomados);
    }

    public static int somaNumeros(int num1, int num2){
        return num1 + num2;
    }
}
