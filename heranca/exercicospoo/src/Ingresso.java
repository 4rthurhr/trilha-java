public class Ingresso {
    protected double valor;
    protected String nome;
    protected boolean dublado;

    public Ingresso(double valor, String nome, boolean dublado){
        this.valor = valor;
        this.nome = nome;
        this.dublado = dublado;
    }

    public double getValor(){
        return valor;
    }

    public String getDublado(){
        return dublado ? "Dublado" : "Legendado";
    }

    public void exibird(){
        System.out.println("Filme: "+nome);
        System.out.println("Tipo: "+getDublado());
        System.out.println("Preço: "+getValor());
    }


    
}
