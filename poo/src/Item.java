public class Item {
    private String nome;
    private double preco;
    private int codigo;

    public Item(String nome, double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void apresentar(){
        System.out.println("Nome do item: "+nome+", preço do item: "+preco+",Codigo: "+codigo);
    }
}
