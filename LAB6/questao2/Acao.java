import java.util.ArrayList;
import java.util.List;

public class Acao implements SujeitoAcao{

    private List<ObserverInvestidor> investidoresList;

    private double valorAcao;

    public Acao(){
        investidoresList = new ArrayList<ObserverInvestidor>();
    }

    public void setValorAcao(double valorAcao) {
        this.valorAcao = valorAcao;

        notifyObservers();
    }

    @Override
    public void addObserver(ObserverInvestidor obs) {
        investidoresList.add(obs);

    }

    @Override
    public void removeObserver(ObserverInvestidor obs) {
        investidoresList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInvestidor o : investidoresList){
            o.update(valorAcao);
        }
    }

}
