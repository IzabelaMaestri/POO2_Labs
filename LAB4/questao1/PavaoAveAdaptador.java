public class PavaoAveAdaptador implements Ave{

    Pavao pavao;

    public PavaoAveAdaptador(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("O Pavão não voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
    
}
