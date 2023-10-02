public class PrefeituraUDI implements ObserverCET {

    @Override
    public void update(CET sujeito) {
        
        if(sujeito.getUmidade() < 20.0){
            System.out.println("Alerta de baixa umidade!!!");

        }

    }
    
}
