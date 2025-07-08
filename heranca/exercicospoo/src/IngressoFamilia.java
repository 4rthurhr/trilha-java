public class IngressoFamilia extends Ingresso {
    private int numeroPessoa;

    public IngressoFamilia(double valor, String nome, boolean dublado, int numeroPessoa){
        super(valor,nome,dublado);
        this.numeroPessoa = numeroPessoa;
    }

    @Override
    public double getValor(){
        double total = valor * numeroPessoa;
        if (numeroPessoa > 3){
            total *= 0.95;
        }

        return total;
    }
}
