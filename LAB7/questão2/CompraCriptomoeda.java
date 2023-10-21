package LAB7.questão2;

public class CompraCriptomoeda extends LojaTemplate{

    @Override
    void processaPagamento() {
        System.out.println("Pagamento feito atravez de Criptomoeda!");
    }

    @Override
    void entrega() {
        System.out.println("Entrega há combinar com o comprador após receber o pagamento!");
    }
    
}
