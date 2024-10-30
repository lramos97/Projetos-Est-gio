package POO.ExerciciosVariaveis;

public class Exercicio6 {

        static long fibo(int n) {
            int F = 0;
            int ant = 0;

            for (int i = 1; i <= n; i++) {

                if (i == 1) {
                    F = 1;
                    ant = 0;
                } else {
                    F += ant;
                    ant = F - ant;
                }

            }

            return F;
        }

        public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                System.out.print(Exercicio6.fibo(i) + " ");
            }

        }
    }

