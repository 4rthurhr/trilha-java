
public abstract class Conta implements InterfConta{
    
   

    protected static int AGENCIAPADRAO =1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


       public Conta(Cliente cliente){
        this.agencia= AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

        
    }

    @Override
    public void depositar(double valor) {
    this.saldo = saldo + valor;    
    
    }

    @Override
    public void sacar(double valor) {
    this.saldo = saldo - valor;
    
    }

    @Override
    public void transfirir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

     protected void infocomuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
    }
    
}
