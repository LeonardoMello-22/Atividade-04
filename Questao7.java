import java.util.Scanner;

public class Questao7{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int numeroInvertido = inverterNumero(numero);

        System.out.println("O número invertido de " + numero + " é: " + numeroInvertido);
        leitor.close();
    }

    private static int inverterNumero(int num) {
        int numeroInvertido = 0;

        while (num != 0) {
            int digito = num % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            num /= 10;
        }

        return numeroInvertido;
    }
}
    

