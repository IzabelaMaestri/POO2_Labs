public class Honda implements IVehicleMaker {

    private static Honda instance;

    public static Honda getInstance() {
        System.out.println("Fabrica Honda Aberta");
        if (instance == null) {
            instance = new Honda();
        }

        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {

        if (modelo.equals("City")) {
            return City.create();
        } else if (modelo.equals("Civic")) {
            return Civic.create();
        } else if (modelo.equals("Fit")) {
            return Fit.create();
        }

        System.out.println("Modelo de carro Honda inexistente!");
        return null;
    }

}
