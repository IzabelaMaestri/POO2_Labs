package LAB7.questão2;

public class CompraLoja extends LojaTemplate{

    @Override
    void processaPagamento() {
        System.out.println("Pagamento presencial em dinheiro, pix ou cartão!");
    }

    @Override
    void entrega() {
        System.out.println("Não há entrega");
    }
    
}
