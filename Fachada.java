package CinemaEmCasa;

/**
 * @author Michael
 */
public class Fachada {

    private DVDPlayer dvd;
    private LuzAmbiente iluminacao;
    private Projetor projetor;
    private Amplificador ampl;
    private Tela tela;
    private Pipoqueira pipoca;

    public void instanciarOsObjetos(String descricaoDVD, String iluminacaoC) {
        dvd = new DVDPlayer(descricaoDVD);
        iluminacao = new LuzAmbiente(iluminacaoC);
        projetor = new Projetor("Projetor sony", dvd);
        ampl = new Amplificador("Amplificador de audio", dvd);
        tela = new Tela("tela para projeção de filmes");
        pipoca = new Pipoqueira("Quero pipoca!");
    }

    public void assistirUmFilme(String nomeFilme) {
        pipoca.on();
        pipoca.fazerPipoca();

        iluminacao.on();
        iluminacao.luminosidadeBaixa();

        tela.descer();

        projetor.on();
        projetor.modoWideScreen();

        ampl.on();
        ampl.somStereo();
        ampl.setVolume(10);

        dvd.on();
        dvd.play(nomeFilme);

       
    }

    public void terminarDeAssistirOFilme() {
        pipoca.off();

        iluminacao.luminosidadeAlta();

        tela.subir();

        projetor.off();

        ampl.off();

        dvd.eject();
        dvd.off();

        System.out.println("========================");
        System.out.println(" fim do filme ......");
        System.out.println("========================");
    }
}
