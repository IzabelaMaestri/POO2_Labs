package LAB7.questão2;

import java.util.Scanner;

public abstract class LojaTemplate {

    Scanner ler = new Scanner(System.in);
    int numItens;
    double valorTotal;

    public void quantidadeItens(){
        System.out.println("Quantidade total de itens do pedidos é:\n");
        numItens = ler.nextInt();
        System.out.println(numItens);
    }

    public void valorItem(){
        System.out.println("Valor total dos itens é igual a:\n ");
        valorTotal = ler.nextInt();
        System.out.println(valorTotal);
    }

    abstract void processaPagamento();

    abstract void entrega();

    public void processaPedido(){
        quantidadeItens();
        valorItem();
        processaPagamento();
        entrega();
    }
    
}
