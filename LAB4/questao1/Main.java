
public class Main {

    public static void main(String[] args) {

        Pato patinho = new PatoDomestico();
        Ave patinhoAve = new PatoAveAdaptador(patinho);

        Pavao pavinho = new PavaoAzul();
        Ave pavinhoAve = new PavaoAveAdaptador(pavinho);

        Main main = new Main();

        main.habilidadesDaAve(patinhoAve);
        main.habilidadesDaAve(pavinhoAve);        
        
    }

    public void habilidadesDaAve(Ave ave) {
        ave.emitirSom();
        ave.voar();
    }
    
}
