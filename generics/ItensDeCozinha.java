package generics;

import java.util.ArrayList;
import java.util.List;

public class ItensDeCozinha<T> {
    private List<T> listaItensDeCozinha;

    public ItensDeCozinha() {
        this.listaItensDeCozinha = new ArrayList<>();
    }

    public void adicionaItem(T item){
        listaItensDeCozinha.add(item);
    }

    public void apresentarItens(){
        for(T itemCozinha : listaItensDeCozinha){
            System.out.println(itemCozinha);
        }
    }
}
