public class Aeroporto implements ObserverCET{

    @Override
    public void update(double temp, double umidade, double vento) {
        
        if (vento > 100.0){
            System.out.println("Alerta de perigo!!!");
        }
    }


    
}
