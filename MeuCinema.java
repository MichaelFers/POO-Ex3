package CinemaEmCasa;

public class MeuCinema {

    public static void main(String[] args) {

        //Criando os objetos
        Fachada fachada = new Fachada();
        fachada.instanciarOsObjetos("Dvd samsung", "Iluminacao do cinema");

        //Para assistir a um filme.....
        fachada.assistirUmFilme("E o vento levou.....");
        
        System.out.println("========================");
        System.out.println(" vou ver o filme ......");
        System.out.println("========================");
        
        //Para terminar o filme.....

        fachada.terminarDeAssistirOFilme();
        
        System.out.println("========================");
        System.out.println(" Que filme mais chato, nãm......");
        System.out.println("========================");

    }

}
