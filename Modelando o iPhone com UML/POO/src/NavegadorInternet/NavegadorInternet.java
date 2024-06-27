package NavegadorInternet;

public class NavegadorInternet implements INavegadorInternet {
    private String urlAtual;

    @Override
    public void exibirPagina(String url) {
        urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + urlAtual);
    }
}

