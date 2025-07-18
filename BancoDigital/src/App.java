public class App {
    public static void main(String[] args) throws Exception {
        Cliente Arthur = new Cliente();
        Arthur.setNome("Arthur");


        Conta cc = new ContaCorrente(Arthur);
        ContaPoupanca cp = new ContaPoupanca(Arthur);

        cc.depositar(250);
        

        cc.transfirir(150, cp);
        cp.infocomuns();
        cc.infocomuns();

    }
}
