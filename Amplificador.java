package CinemaEmCasa;


public class Amplificador extends LigaveisDesligaveisAbstrata {
	private String modo;
	private int volume;
	
	private static String MODE_STEREO = "stereo";
	private static String MODE_NORMAL = "normal";
	
	private DVDPlayer dvdPlayer;
	
	public Amplificador(String desc, DVDPlayer dvdPlayer) {
		super.descricao = desc;
		super.status = OFF;
		this.modo = MODE_STEREO;
		this.volume = 0;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void somStereo() {
		if (status == OFF) {
			System.out.println("amplificador desligado");
		} else {
			this.modo = MODE_STEREO;
			System.out.println(descricao + " som " + modo);
		}
	}
 
	public void somNormal() {
		if (status == OFF) {
			System.out.println("amplificador desligado");
		} else {
			this.modo = MODE_NORMAL;
			System.out.println(descricao + " som " + modo);
		}
	}
	
	public void setVolume(int nivel) {
		if (status == OFF) {
			System.out.println("amplificador desligado");
		} else {
			this.volume = nivel;
			System.out.println(descricao + " modificou volume para " + nivel);
		}
	}

}
