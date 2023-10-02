
public interface Sujeito {

    public void addObserver(ObserverCET obs);

    public void removeObserver(ObserverCET obs);

    public void notifyObservers();
    
}
