public class App {
    public static void main(String[] args) throws Exception {
        
        Smartphone smartphone = new Smartphone();

        smartphone.selecionarMusica("Maneva");
        smartphone.TocarMusica();
        smartphone.pausarMusica();
        
    

        smartphone.ligar("9962977");
        smartphone.atender();
        smartphone.iniciarCorreioVoz();

        smartphone.exibirPagina("www.google");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
    
    }
}
