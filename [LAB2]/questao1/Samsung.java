public class Samsung implements FabricanteCelular {
    private static Samsung instance;

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }

        return instance;
    }

    @Override
    public Celular constroiCelular(String modelo) {

        if (modelo.equals("Galaxy8")) {
            return Galaxy8.create();
        } else if (modelo.equals("Galaxy20")) {
            return Galaxy20.create();
        }
        System.out.println("Modelo de celular Samsung inexistente!");
        return null;
    }

}
