package POO.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Teste {


    public static void main(String[] args) {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>(); //ArrayList temp = 179. LinkedList temp = 652
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = 0; i < MAX; i++) {
            lista.contains(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tFim - tInicio));
    }


}
