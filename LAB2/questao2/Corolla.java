public class Corolla implements IVehicle{

    public static Corolla create() {
        System.out.println("Toyota Corolla Fabricado com sucesso!");
        return new Corolla();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Toyota Corolla");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Toyota Corolla");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Toyota Corolla");
    }
    
}