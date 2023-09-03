public class Hilux implements IVehicle{

    public static Hilux create() {
        System.out.println("Toyota Hilux Fabricado com sucesso!");
        return new Hilux();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Toyota Hilux");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Toyota Hilux");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Toyota Hilux");
    }
    
}