public class Galaxy20 implements Celular {
    public static Galaxy20 create() {
        return new Galaxy20();
    }

    @Override
    public void fazLigacao() {
        System.out.println("Alo alo marciano! - Galaxy20");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Diga X - Galaxy20");
    }
}
