import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int somaDigitos = calcularSomaDigitos(numero);

        System.out.println("A soma dos dígitos de " + numero + " é: " + somaDigitos);
        leitor.close();
    }

    private static int calcularSomaDigitos(int num) {
        int soma = 0;

        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }

        return soma;
    }
}