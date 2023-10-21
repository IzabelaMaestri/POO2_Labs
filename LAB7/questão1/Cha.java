public class Cha extends BebidaTemplate{

    @Override
    void preparaBebida() {
        System.out.println("Colocando a erva desejada");
    }

    @Override
    void adicionaCodimentos() {
        System.out.println("Adicionando saches de açucar ao pedido caso o cliente queira adoçar");
    }
    
}
