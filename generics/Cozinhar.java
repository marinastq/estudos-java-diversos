package generics;

public class Cozinhar {
    private String nome;
    private String ondeUsar;

    public String getNome() {
        return nome;
    }

    public String getOndeUsar() {
        return ondeUsar;
    }

    public Cozinhar(String nome, String ondeUsar) {
        this.nome = nome;
        this.ondeUsar = ondeUsar;
    }

    public  String toString(){
        return nome + " é para ser usado em " + ondeUsar;
    }
}
