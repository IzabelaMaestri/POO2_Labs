public class Canela extends DecoracaoCafe{

    public Canela(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com canela";
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 2.0;
    }
   
}