package POO.ExerciciosVariaveis;

public class Exercicio8 {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 1; i <= 10; i++) {
            for (j=1; j<=i; j++ ) {
                System.out.print(i*j + "  ");
            }
            System.out.println();
        }
    }
}
