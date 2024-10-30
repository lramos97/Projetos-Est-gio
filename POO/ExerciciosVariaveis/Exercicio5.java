package POO.ExerciciosVariaveis;

public class Exercicio5 {
    public static void main(String[] args) {

        long fatorial = 1;

        for (long n = 1; n <= 40; n++) {
            fatorial *= n; //
            System.out.println("Fatorial de " + n + " é " + fatorial);

            //para cálculos com números muito grandes, é necessário utilizar long ao invés de int.
        }
    }
}
