public class Nutella extends DecoracaoCafe{

    public Nutella(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com nutella";
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 5.0;
    }
   
}