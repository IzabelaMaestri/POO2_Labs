package LAB8.questão3;

public class Bicicleta extends Veiculo{

    @Override
    public void accept(Visitor v) {
        v.visist(this);
        System.out.println("Comemore no parque o dia do ciclismo");
    }

    

}
