package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ExemploComparing {
    public static void main(String[] args) {
        List<Todo> tarefas = new ArrayList<>();
        tarefas.add(new Todo(1, "Estudar para aula"));
        tarefas.add(new Todo(10, "Fazer relario"));
        tarefas.add(new Todo(12, "Analise do relatorio"));

        Comparator<Todo> comparaDescricao = Comparator.comparing(Todo::getDescricao);
        tarefas.sort(comparaDescricao);

        System.out.print(tarefas);


    }
}
