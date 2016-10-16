package CinemaEmCasa;


public abstract class LigaveisDesligaveisAbstrata implements LigaveisDesligaveisIF {

	protected int status;
	protected String descricao;
	
	protected static int ON = 1;
	protected static int OFF = 0;
	
	public void on() {
		this.status = ON;
		System.out.println(descricao + " ligado");
	}
 
	public void off() {
		this.status = OFF;
		System.out.println(descricao + " desligado");
	}

}
