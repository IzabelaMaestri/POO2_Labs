public class Fit implements IVehicle{

    public static Fit create() {
        System.out.println("Honda Fit Fabricado com sucesso!");
        return new Fit();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Honda Fit");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Honda Fit");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Honda Fit");
    }
    
}