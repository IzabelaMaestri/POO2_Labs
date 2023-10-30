package LAB8.questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens = new ArrayList<>();

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public void removeItem(Item item){
        itens.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;
        for(Item item : itens){
            sum += item.getPreco();
        }
        return sum;
    }

    void realizaPagamentos(PagamentoStrategy strategy){
        int valorTotal = this.calculaTotal();
        strategy.pagar(valorTotal);
    }

    
    
}
