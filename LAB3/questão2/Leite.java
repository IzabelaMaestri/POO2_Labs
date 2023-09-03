public class Leite extends DecoracaoCafe{

    public Leite(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com leite";
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 4.0;
    }
   
}