
public class Investidor implements ObserverInvestidor {

    private AcaoBroker acaoBroker;
    
    private double valorAcaoMax;
    private double valorAcaoMin;
    public Investidor(){
        acaoBroker = new AcaoBroker();
    }

    @Override
    public void update(double valorAcao) {
        acaoBroker.analisaAcao(valorAcao, valorAcaoMax, valorAcaoMin);
        
    }

    public void setValorAcaoMax(double valorAcaoMax) {
        this.valorAcaoMax = valorAcaoMax;
    }

    public void setValorAcaoMin(double valorAcaoMin) {
        this.valorAcaoMin = valorAcaoMin;
    }
    
}
