public class MainCarro {

    public static void main(String ... args){
        
        Motor motor = new Motor();
        Porta porta = new Porta();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Farol farol = new Farol();
        Radio radio = new Radio();
        
        
        CarroFachada carroFachada = new CarroFachada(motor, porta, cinto, farol, radio);

		carroFachada.dirigindoOCarro();
        carroFachada.fimDaCorrida();
    }
    
}
