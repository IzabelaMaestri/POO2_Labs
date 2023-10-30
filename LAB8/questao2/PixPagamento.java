package LAB8.questao2;

public class PixPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valorTotal) {
        System.out.println("Pagar com o pix o valor de: R$" +valorTotal);
    }
    
}
