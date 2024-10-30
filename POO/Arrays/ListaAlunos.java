package POO.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaAlunos {
    public static void main(String[] args){
        List<String> lista = new ArrayList<String>();

        Aluno a = new Aluno("João da Silva", "Matemática", 0);
        Aluno b = new Aluno("Laura Cardoso", "Química", 0);
        Aluno c = new Aluno("Otávio Souza", "Português", 0);
        Aluno d = new Aluno("Cláudio Meirelles", "Matemática", 0);
        Aluno e = new Aluno("Isabella Cristina", "Matemática", 0);
        lista.add(String.valueOf(a));
        lista.add(String.valueOf(b));
        lista.add(String.valueOf(c));
        lista.add(String.valueOf(d));
        lista.add(String.valueOf(e));
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }
}
