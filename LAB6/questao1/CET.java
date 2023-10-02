import java.util.ArrayList;

public class CET implements Sujeito { 

    private ArrayList<ObserverCET> observers;

    public CET(){
        observers = new ArrayList<ObserverCET>();
    }
    
    private double temperatura;
    public double getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
        notifyObservers();
    }
    
    private double umidade;
    public double getUmidade(){
        return umidade;
    }
    public void setUmidade(double umidade){
        this.umidade = umidade;
        notifyObservers();
    }
    
    private double tempo;
    public double getTempo(){
        return tempo;
    }
    public void setTempo(double tempo){
        this.tempo = tempo;
        notifyObservers();
    }

    public void init(double temperatura, double umidade, double tempo){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.tempo = tempo;
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
        for (int i = 0; i < observers.size(); i++) {

            observers.get(i).update(this);
            
        }
    }
    
}
