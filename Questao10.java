public class Questao10 {
    public static void main(String[] args) {
        int numero = 9;
        int multiplicador = 1;

        System.out.println("Tabuada do 9:");

        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
    }
}