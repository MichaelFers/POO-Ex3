package CinemaEmCasa;


public class Pipoqueira extends LigaveisDesligaveisAbstrata{ 
	
	public Pipoqueira(String description) {
		super.descricao = description;
		super.status = OFF;
	}
 
	public void fazerPipoca() {
		if (status == ON) {
			System.out.println(descricao + " cheiro de pipoca no ar!");
		} else {
			System.out.println(descricao + " pipoqueira desligada!");
		}
	}
}
