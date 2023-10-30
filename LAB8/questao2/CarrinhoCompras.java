package LAB8.questao2;

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

    public int calculaSubTotal(){
        int sum = 0;
        for(Item item : itens){
            sum += item.getPreco();
        }
        return sum;
    }

    void realizaPagamentos(PagamentoStrategy pagamentoStrategy, EnvioStrategy envioStrategy){
        int subTotal = this.calculaSubTotal();
        int tipoFrete = envioStrategy.tipoFrete();
        double valorTotal = this.somaFrete(tipoFrete, subTotal);
        pagamentoStrategy.pagar(valorTotal);
    
    }


    public double somaFrete(int tipoFrete, int subTotal){
        if (tipoFrete == 1){
            return subTotal + (subTotal * 0.2);

        }
        else if (tipoFrete == 2) {
            return subTotal + (subTotal * 0.1);
            
        } else {
            return subTotal;
        } 
    }
        
}
