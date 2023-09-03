public class Chocolate extends DecoracaoCafe{

    public Chocolate(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com chocolate";
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 3.0;
    }
   
}