public class PrefeituraUDI implements ObserverCET {

    @Override
    public void update(double temp, double umidade, double vento) {
        
        if(umidade < 20.0){
            System.out.println("Alerta de baixa umidade!!!");

        }

    }
    
}
