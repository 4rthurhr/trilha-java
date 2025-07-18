public interface InterfConta {
    
    public void sacar(double valor);

    public void depositar(double valor);

    public void transfirir(double valor, Conta contaDestino);
}
