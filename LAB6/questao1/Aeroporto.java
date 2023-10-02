public class Aeroporto implements ObserverCET{

    @Override
    public void update(CET sujeito) {
        
        if (sujeito.getTempo() > 70.0){
            System.out.println("Alerta de alta de vento!!!");
        }
    }


    
}
