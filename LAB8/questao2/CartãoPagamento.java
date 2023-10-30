package LAB8.questao2;

public class CartãoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valorTotal) {
        System.out.println("Pagar com cartão o valor de: R$" +valorTotal);
    }
    
}
