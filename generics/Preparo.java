package generics;

public class Preparo {
    private String nome;
    private String funcao;

    public Preparo(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return nome + " tem a funcao de " + funcao;
    }
}
