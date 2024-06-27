import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Usando o Reprodutor Musical
        System.out.println("Testando Reprodutor Musical:");
        meuIPhone.getReprodutorMusical().selecionarMusica("Imagine - John Lennon");
        meuIPhone.getReprodutorMusical().tocar();
        meuIPhone.getReprodutorMusical().pausar();

        // Usando o Aparelho Telefônico
        System.out.println("\nTestando Aparelho Telefônico:");
        meuIPhone.getAparelhoTelefonico().ligar("111-1111-1111");
        meuIPhone.getAparelhoTelefonico().atender();
        meuIPhone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Usando o Navegador na Internet
        System.out.println("\nTestando Navegador na Internet:");
        meuIPhone.getNavegadorInternet().exibirPagina("https://www.dio.me");
        meuIPhone.getNavegadorInternet().adicionarNovaAba();
        meuIPhone.getNavegadorInternet().atualizarPagina();
    }
}
