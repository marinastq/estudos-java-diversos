package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioLista {
    //Filtrando uma Lista:
    //Dada uma lista de números inteiros, use uma expressão lambda para filtrar todos os números pares.
    //Tente também filtrar os números maiores que um determinado valor.

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 10, 5, 4, 19));

        List<Integer> listaPares = lista.stream()
                .filter(n -> n % 2 ==0)
                .toList();

        System.out.println(listaPares);

    }

}
