import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        System.out.println("Os divisores de " + numero + " são:");

        exibirDivisores(numero);
        leitor.close();
    }

    private static void exibirDivisores(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}