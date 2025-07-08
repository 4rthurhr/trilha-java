public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingresso = new Ingresso(20.0, "Matrix", false);
        MeiaEntrada meia = new MeiaEntrada(20.0, "Vingadores", true);
        IngressoFamilia familia = new IngressoFamilia(20.0, "Toy story", true, 4);

        System.out.println("Ingresso comun");
        ingresso.exibird();

        System.out.println("Ingreso meia");
        meia.exibird();

        System.out.println("Ingresso familia");
        familia.exibird();
    }
}
