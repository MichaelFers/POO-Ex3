package CinemaEmCasa;


public class Projetor extends LigaveisDesligaveisAbstrata {
	private DVDPlayer dvdPlayer;
	
	private int status;
	private String modo;
	
	public static int ON = 1;
	public static int OFF = 0;
	
	private static String MODE_WIDESCREEN = "widescreen";
	private static String MODE_NORMAL = "normal";
	
	public Projetor(String description, DVDPlayer dvdPlayer) {
		super.descricao = description;
		this.dvdPlayer = dvdPlayer;
		this.status = OFF;
		this.modo = MODE_NORMAL;
	}
 
	
	public void modoWideScreen() {
		if (status == OFF) {
			System.out.println("projetor desligado");
		} else {
			this.modo = MODE_WIDESCREEN;
			System.out.println(descricao + " em modo widescreen ");
		}
	}

	public void modoNormal() {
		if (status == OFF) {
			System.out.println("projetor desligado");
		} else {
			this.modo = MODE_NORMAL;
			System.out.println(descricao + " em modo normal");
		}
	}
}
