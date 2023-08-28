public class Toyota implements IVehicleMaker {

    private static Toyota instance;

    public static Toyota getInstance() {
        System.out.println("Fabrica Toyota Aberta");
        if (instance == null) {
            instance = new Toyota();
        }

        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {

        if (modelo.equals("Corolla")) {
            return Corolla.create();
        } else if (modelo.equals("Hilux")) {
            return Hilux.create();
        } else if (modelo.equals("Etios")) {
            return Etios.create();
        }

        System.out.println("Modelo de carro Toyota inexistente!");
        return null;
    }

}
