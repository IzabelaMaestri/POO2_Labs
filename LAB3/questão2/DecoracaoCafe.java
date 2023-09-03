public class DecoracaoCafe implements Cafe{

    Cafe cafe;

    public DecoracaoCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
    
}