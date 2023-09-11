
public class MainCam {
    public static void main(String[] args) {
        Camera cameraPolaroid = new CameraPolaroidAdapter();
        Camera cameraDigital = new CameraDigitalAdapter();

        System.out.println("Camera Digital");
        cameraDigital.tirarFoto();
        cameraDigital.pegarFoto();
        
        System.out.println("\nCamera Polaroid");
        cameraPolaroid.tirarFoto();
        cameraPolaroid.pegarFoto();
    }
}
