public class Main {
    
    public static void main(String ... args){
        
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoqueira = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        Player player = new Player();
        Telao telao = new Telao();
        
        
        HomeTheaterFachada homeTheater = 
				new HomeTheaterFachada(amp, player, projetor, luzes, telao, pipoqueira);
 
		homeTheater.assistirFilme("Besouro Azul");
                homeTheater.fimDoFilme();
    }
}