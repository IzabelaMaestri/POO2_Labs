public class Main {

    public static void main(String[] args) {
        Apple apple = Apple.getInstance();
        Celular iphoneX = apple.constroiCelular("IphoneX");
        Celular iphoneS = apple.constroiCelular("IphoneS");

        iphoneX.fazLigacao();
        iphoneS.fazLigacao();
        iphoneX.tiraFoto();
        iphoneS.tiraFoto();

        Samsung samsung = Samsung.getInstance();
        Celular galaxy20 = samsung.constroiCelular("Galaxy20");
        Celular galaxy8 = samsung.constroiCelular("Galaxy8");

        galaxy20.fazLigacao();
        galaxy8.fazLigacao();
        galaxy20.tiraFoto();
        galaxy8.tiraFoto();



    }
}
