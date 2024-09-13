package generics;

public class Enxoval {
    public static void main(String[] args) {
        ItensDeCozinha<Object> listaItens = new ItensDeCozinha<>();

        listaItens.adicionaItem(new Servir("Travessa de vidro", 1000));
        listaItens.adicionaItem(new Cozinhar("Panela", "fogao"));
        listaItens.adicionaItem(new Cozinhar("Forma de bolo", "forno"));
        listaItens.adicionaItem(new Servir("Copo", 250));
        listaItens.adicionaItem(new Preparo("Tabua", "cortar legumes"));

        System.out.println("Itens do enxoval: ");
        listaItens.apresentarItens();
    }
}
