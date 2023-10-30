package LAB8.questao2;

public class EnvioNormal implements EnvioStrategy{

    @Override
    public int tipoFrete() {
        System.out.println("Tipo de envio NORMAL!");
        return 2;
    }
    
}
