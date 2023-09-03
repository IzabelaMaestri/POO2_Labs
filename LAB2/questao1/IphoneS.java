public class IphoneS implements Celular {
    public static IphoneS create() {
        return new IphoneS();
    }
    @Override
    public void fazLigacao() {
        System.out.println("Alo alo marciano! - IphoneS");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Diga X - IphoneS");
    }
}
