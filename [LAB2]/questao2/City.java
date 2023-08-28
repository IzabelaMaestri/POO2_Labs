public class City implements IVehicle{

    public static City create() {
        System.out.println("Honda City Fabricado com sucesso!");
        return new City();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Honda City");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Honda City");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Honda City");
    }
    
}
