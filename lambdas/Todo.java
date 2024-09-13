package lambdas;

public class Todo {

    private Integer prioridade;
    private String descricao;

    public Todo(Integer prioridade, String descricao){
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public Integer getPrioridade() {
            return prioridade;
        }

    public String getDescricao() {
            return descricao;
        }

    @Override
    public String toString() {
        return "Prioridade=" + prioridade + ", descricao=" + descricao ;
    }
}
