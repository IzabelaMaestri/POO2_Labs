package LAB8.questão3;

public class Carro extends Veiculo{

    @Override
    public void accept(Visitor v) {
        v.visist(this);
        System.out.println("Favor atualizar dados do IPVA");
    }
    
}
