public interface SujeitoAcao {

    public void addObserver(ObserverInvestidor obs);
    public void removeObserver(ObserverInvestidor obs);

    public void notifyObservers();
    
}
