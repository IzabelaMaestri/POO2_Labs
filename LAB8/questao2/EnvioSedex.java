package LAB8.questao2;

public class EnvioSedex implements EnvioStrategy{

    @Override
    public int tipoFrete() {
        System.out.println("Envio do tipo SEDEX!");
        return 1;
    }

}
