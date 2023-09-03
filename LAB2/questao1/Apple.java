public class Apple implements FabricanteCelular {
    private static Apple instance;

    public static Apple getInstance() {
        if (instance == null) {
            instance = new Apple();
        }

        return instance;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IphoneX")) {
            return IphoneX.create();
        } else if (modelo.equals("IphoneS")) {
            return IphoneS.create();
        }

        System.out.println("Modelo de celular Apple inexistente!");
        return null;

    }

}
