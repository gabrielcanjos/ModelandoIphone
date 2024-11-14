public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
    @Override
    public void tocar() { System.out.println("Reproduzindo música."); }
    @Override
    public void pausar() { System.out.println("Música pausada."); }
    @Override
    public void selecionarMusica(String musica) { System.out.println("Música selecionada: " + musica); }
    @Override
    public void ligar(String numero) { System.out.println("Ligando para o número: " + numero); }
    @Override
    public void atender() { System.out.println("Atendendo a chamada."); }
    @Override
    public void iniciarCorreioVoz() { System.out.println("Iniciando o correio de voz."); }
    @Override
    public void exibirPagina(String url) { System.out.println("Exibindo a página: " + url); }
    @Override
    public void adicionarNovaAba() { System.out.println("Nova aba adicionada."); }
    @Override
    public void atualizarPagina() { System.out.println("Página atualizada."); }
}
