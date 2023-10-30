package LAB8.questão3;

public class Onibus extends Veiculo{

    @Override
    public void accept(Visitor v) {
        v.visist(this);
        System.out.println("Atenção para a atualização das lincenças");
    }

    
    
}
