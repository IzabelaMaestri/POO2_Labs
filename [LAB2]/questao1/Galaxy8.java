public class Galaxy8 implements Celular {
    public static Galaxy8 create() {
        return new Galaxy8();
    }

    @Override
    public void fazLigacao() {
        System.out.println("Alo alo marciano! - Galaxy8");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Diga X - Galaxy8");
    }
}
