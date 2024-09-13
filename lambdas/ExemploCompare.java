package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCompare {
    public static void main(String[] args) {
        List<Todo> tarefas = new ArrayList<>();
        tarefas.add(new Todo(1, "Estudar para aula"));
        tarefas.add(new Todo(10, "Fazer relario"));
        tarefas.add(new Todo(12, "Analise do relatorio"));

        Comparator<Todo> comparaDescricao = (desc1, desc2) -> desc1.getDescricao().compareTo(desc2.getDescricao());

        Comparator<Todo> comparaPrioridade = (desc1, desc2) -> desc1.getPrioridade().compareTo(desc2.getPrioridade());

        //comparando 2
        int desc1 = 2;
        int desc2 = 1;

        if(comparaPrioridade.compare(tarefas.get(desc1), tarefas.get(desc2)) > 0){
            System.out.println("Por prioridade: " + tarefas.get(desc1).getDescricao());
        } else {
            System.out.println("Por prioridade: " + tarefas.get(desc2).getDescricao());
        }

        //negativo se 1 for menor que 2
        //positivo se 1 for maior que 2
        if(comparaDescricao.compare(tarefas.get(desc1), tarefas.get(desc2)) > 0){
            System.out.println("Por descricao: " + tarefas.get(desc2).getDescricao());
        } else {
            System.out.println("Por descricao: " + tarefas.get(desc1).getDescricao());
        }

    }
}
