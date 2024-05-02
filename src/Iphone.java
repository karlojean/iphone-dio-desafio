public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina sendo exibida");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("A pagina foi atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Musica começou a tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("A musica foi selecionada");
    }

}
