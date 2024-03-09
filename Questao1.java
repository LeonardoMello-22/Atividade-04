import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroDeAlunos = 5;
        int alunosAprovados = 0;

        for (int i = 1; i <= numeroDeAlunos; i++) {
            System.out.print("Digite a média do aluno " + i + ": ");
            float nota = leitor.nextFloat();

            if (nota >= 7) {
                alunosAprovados++;
            }
        }

        System.out.println("Número de alunos aprovados: " + alunosAprovados);
        leitor.close();
    }
}