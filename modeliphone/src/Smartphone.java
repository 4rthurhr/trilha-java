public class Smartphone implements Musical, Telefonico, Internet{
    
    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibindo pagina! " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina! ");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando " + numero);
        
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
       
    }

    @Override
    public void TocarMusica() {
       System.out.println("Tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
      
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecione a musica "+ musica);
       
    }

    


    
}