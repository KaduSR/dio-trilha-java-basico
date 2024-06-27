package ReprodutorMusical;
public class ReprodutorMusical implements IReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausado: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
