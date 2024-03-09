import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeAlturas = 5;
        float somaAlturas = 0;

        for (int i = 1; i <= quantidadeAlturas; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            float altura = leitor.nextFloat();
            somaAlturas += altura;
        }

        float media = somaAlturas / quantidadeAlturas;

        System.out.println("A média de altura é: " + media);
        leitor.close();
    }
}