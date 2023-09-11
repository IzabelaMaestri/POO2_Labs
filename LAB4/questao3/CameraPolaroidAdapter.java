public class CameraPolaroidAdapter implements Camera {
    private CameraPolaroid cameraPolaroid;

    public CameraPolaroidAdapter() {
        this.cameraPolaroid = new CameraPolaroid();
    }

    @Override
    public void tirarFoto() {
        String result = cameraPolaroid.tiraFoto();
        System.out.println(result);
    }

    @Override
    public void pegarFoto() {
        String result = cameraPolaroid.imprimeFoto();
        System.out.println(result);
    }

}
