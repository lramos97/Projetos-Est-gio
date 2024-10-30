package POO.ExerciciosVariaveis;

public class Exercicio7 {
    public static void main(String[] args) {

        int i = 15;

        while (i != 1) {

            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = 3 * i + 1;
            }

            System.out.println(i);
        }

    }

}