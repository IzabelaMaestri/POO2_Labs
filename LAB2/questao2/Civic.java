public class Civic implements IVehicle{

    public static Civic create() {
        System.out.println("Honda Civic Fabricado com sucesso!");
        return new Civic();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Honda Civic");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Honda Civic");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Honda Civic");
    }
    
}