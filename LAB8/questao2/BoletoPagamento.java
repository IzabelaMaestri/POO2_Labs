package LAB8.questao2;

public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valorTotal) {
        System.out.println("Pagar com boleto o valor de: R$" +valorTotal);
    }
    
}
