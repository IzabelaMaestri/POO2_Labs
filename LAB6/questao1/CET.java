import java.util.ArrayList;
import java.util.List;
public class CET implements SujeitoCET { 
    
    private List<ObserverCET> observers;

    private double temperatura;
    private double umidade;
    private double vento;

    public CET(){
        observers = new ArrayList<ObserverCET>();
    }    

    @Override
    public void addObserver(ObserverCET obs) { 
        observers.add(obs);
    }

    @Override
    public void removeObserver(ObserverCET obs) {
        observers.remove(obs);        
    }

    @Override
    public void notifyObservers() {
        
        for(ObserverCET o : observers){

            o.update(temperatura, umidade, vento);

        }
        
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;

        notifyObservers();
    }

    public void setUmidade(double umidade){
        this.umidade = umidade;

        notifyObservers();
    }

    public void setVento(double vento) {
        this.vento = vento;

        notifyObservers();
    }

}
