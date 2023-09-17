public class HomeTheaterFachada {

	Amplificador amp;
	Player player;
	Projetor projetor;
	Luzes luzes;
	Telao telao;
	MaquinaDePipoca pipoqueira;
 
	public HomeTheaterFachada(Amplificador amp,
                    Player player,
                    Projetor projetor,
                    Luzes luzes,
                    Telao telao,
                    MaquinaDePipoca pipoqueira) {
 
		this.amp = amp;
		this.player = player;
		this.projetor = projetor;
		this.telao = telao;
		this.luzes = luzes;
		this.pipoqueira = pipoqueira;
	}
 
	public void assistirFilme(String filme) {
            
		System.out.println("Preparando para o cineminha em casa");
                pipoqueira.liga();
                pipoqueira.arrebentaPipoca();
                luzes.desliga();
                telao.abaixa();
                projetor.liga();
                amp.liga();
                amp.ajustaVolume(10);
                player.liga();
                player.play(filme);
                
	}
 
 
	public void fimDoFilme() {
		System.out.println("Desligando tudo pra dormir");
		
	}

}
