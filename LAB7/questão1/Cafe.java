public class Cafe extends BebidaTemplate{

    @Override
    public void preparaBebida() {
        System.out.println("Colocando o po de café");
    }

    @Override
    void adicionaCodimentos() {
        System.out.println("Adicionando o açucar");
    }
    
}
