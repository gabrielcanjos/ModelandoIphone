public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.ligar("555-1234");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
