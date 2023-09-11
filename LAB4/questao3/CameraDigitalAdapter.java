public class CameraDigitalAdapter implements Camera {
    private CameraDigital cameraDigital;

    public CameraDigitalAdapter() {
        this.cameraDigital = new CameraDigital();
    }

    @Override
    public void tirarFoto() {
        String result = cameraDigital.tirarFoto();
        System.out.println(result);
    }

    @Override
    public void pegarFoto() {
        String result = cameraDigital.revelarFoto();
        System.out.println(result);
    }

}
