public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nome, boolean dublado){
        super(valor, nome, dublado);
    }

    @Override
    public double getValor(){
        return valor / 2;
    }

}
