public class CarroFachada {

    Motor motor;
	Porta porta;
	CintoDeSeguranca cinto;
    Farol farol;
	Radio radio;
 
	public CarroFachada(Motor motor,
                    Porta porta,
                    CintoDeSeguranca cinto,
                    Farol farol,
                    Radio radio) {
 
		this.motor = motor;
		this.porta = porta;
		this.cinto = cinto;
        this.farol = farol;
        this.radio = radio;

	}
 
	public void dirigindoOCarro() {
            
		System.out.println("Vamos dar uma voltinha de carro!?");
                motor.liga();
                porta.trancar();
                cinto.travar();
                farol.acender();
                radio.ligaRadio();
                radio.sintonizaRadio(7);
                
	}
 
 
	public void fimDaCorrida() {
		System.out.println("Desligando o carro!");
        motor.desliga();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligaRadio();
		
	}
    
}
