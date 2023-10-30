package LAB8.questao1;

public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(int valorTotal) {
        System.out.println("Pagar com boleto!");
    }
    
}
