public class IphoneX implements Celular {
    public static IphoneX create() {
        return new IphoneX();
    }
    @Override
    public void fazLigacao() {
        System.out.println("Alo alo marciano! - IphoneX");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Diga X - IphoneX");
    }
}
