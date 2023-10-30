package LAB8.questao1;

public class MainEC {

    public static void main(String ... args){
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionaItem(new Item("livro x", 50) );
        carrinho.adicionaItem(new Item("tenis y", 800));
        
        // supondo que o usuario escolheu pagar com pix
        PagamentoStrategy strategy = new PixPagamento();
        
        carrinho.realizaPagamentos(strategy);
        
    }
    
}
