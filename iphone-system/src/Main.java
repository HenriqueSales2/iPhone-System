import aparelho.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto Iphone
        Iphone iphone = new Iphone();

        // Testando os métodos da interface ReprodutorMusical
        iphone.tocarMusica("Shape of You");
        iphone.pausarMusica();
        iphone.adicionarMusica("Despacito");

        // Testando os métodos da interface NavegadorInternet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.youtube.com");
        iphone.atualizarPagina();

        // Testando os métodos da interface AparelhoTelefonico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz("987654321");
    }
}
