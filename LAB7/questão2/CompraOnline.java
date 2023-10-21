package LAB7.questão2;

public class CompraOnline extends LojaTemplate{

    @Override
    void processaPagamento() {
        System.out.println("Pagamento feito online via Pix ou Cartão!");
    }

    @Override
    void entrega() {
        System.out.println("Entrega pelo correio quando em outra cidade ou por motoboy quando na mesma cidade da loja!");
    }
    
}
