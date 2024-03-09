public class Questao9 {
    public static void main(String[] args) {
        int numero = 1;
        int produto = 1;

        while (numero <= 5) {
            produto *= numero;
            numero++;
        }

        System.out.println("O produto de 0 a 5 é: " + produto);
    }
}