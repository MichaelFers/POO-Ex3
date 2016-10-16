package CinemaEmCasa;


public class DVDPlayer extends LigaveisDesligaveisAbstrata {
	
	private String filme;
	private int faixaAtual;

	
	public DVDPlayer(String desc) {
		super.descricao = desc;
		super.status = OFF;
	}
 
	public void play(String filme) {
    	if (status == ON){
    		this.filme = filme;
    		faixaAtual = 0;
    		System.out.println(descricao + " playing \"" + filme + "\"");	
    	}
	}

    public void eject() {
    	if (status == ON){
    		if (filme != null) {
    			filme = null;
    			System.out.println(descricao + " eject");
    		} else {
    			System.out.println(descricao + " n�o pode ejetar - sem DVD ");
    		}
    	}
    }
 
    public void avancar() {
    	if (status == ON){
   			if (filme == null) {
    			System.out.println(descricao + " sem DVD ");
    		} else {
    			faixaAtual = faixaAtual++;
    			System.out.println(descricao + " faixa " + faixaAtual + " do filme \"" + filme + "\"");
    		}
    	}
	}

    public void voltar() {
    	if (status == ON){
    		if (filme == null) {
    			System.out.println(descricao + " sem DVD ");
    		} else {
    			faixaAtual = faixaAtual--;
    			System.out.println(descricao + " faixa " + faixaAtual + " do filme \"" + filme + "\"");
    		}
    	}
	}
	
    public void stop() {
    	if (status == ON){
    		faixaAtual = 0;
    		System.out.println(descricao + " stopped \"" + filme + "\"");
    	}
	}
 
	public void pause() {
    	if (status == ON){
    		System.out.println(descricao + " paused \"" + filme + "\"");
    	}
	}

}
