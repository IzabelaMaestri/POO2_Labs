package LAB7.questão2;

// A diferença entre Template e Decorator é

public class MainLojaTemp {
    
    public static void main(String ... args){
        
        CompraOnline online = new CompraOnline();
        online.processaPedido();

        CompraLoja loja = new CompraLoja();
        loja.processaPedido();

        CompraCriptomoeda cripto = new CompraCriptomoeda();
        cripto.processaPedido();
        
    }
}
