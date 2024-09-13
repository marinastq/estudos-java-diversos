package generics;

public class Servir {
    private String nome;
    private double capacidade;

    public String getNome() {
        return nome;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public Servir(String nome, double capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return nome + " tem a capacidade de " + capacidade + " ml";
    }
}
