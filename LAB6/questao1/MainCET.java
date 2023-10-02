public class MainCET {

    public static void main(String... args) {

        CET cet = new CET();
        cet.init(24, 80, 30);

        PrefeituraUDI pref = new PrefeituraUDI();

        Aeroporto aero = new Aeroporto();

        cet.addObserver(pref);

        cet.addObserver(aero);

        cet.setUmidade(15);

        cet.setTempo(100);

    }

}
