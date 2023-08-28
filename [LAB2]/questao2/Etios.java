public class Etios implements IVehicle{

    public static Etios create() {
        System.out.println("Toyota Etios Fabricado com sucesso!");
        return new Etios();
    }

    @Override
    public void start() {
        System.out.println("Ligar Motor - Toyota Etios");
    }

    @Override
    public void drive() {
        System.out.println("Atenção na estrada - Toyota Etios");
    }

    @Override
    public void stop() {
        System.out.println("Desligar Motor - Toyota Etios");
    }
    
}