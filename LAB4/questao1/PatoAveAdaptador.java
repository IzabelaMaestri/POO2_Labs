public class PatoAveAdaptador implements Ave{

    Pato pato;

    public PatoAveAdaptador(Pato pato){
        this.pato = pato;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
    
}
