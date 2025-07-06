package Exercicios;

import java.util.Scanner;

public class Banco {
    private double saldo;  // Atributos da conta
    private double chequeEspecial;
    private double chequeEspecialUsado = 0;
    


    public Banco(double depositoInical){
        this.saldo = depositoInical;

        if (depositoInical <= 500) {
            this.chequeEspecial = 50;
        } else {this.chequeEspecial = depositoInical * 0.5;}
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual: R$ " + saldo);
    }

    public void consultarCheque() {
        System.out.println("Limite do cheque especial: " + chequeEspecial);
        System.out.println("Valor utilizado do cheque especial: " + chequeEspecialUsado);
    }

    public void depositar(double valor){
        if (chequeEspecialUsado > 0){double taxa =chequeEspecialUsado * 0.2;
        double totalDivida = chequeEspecialUsado + taxa;
            
            if(valor >=totalDivida){valor -= totalDivida;
                chequeEspecialUsado = 0;
                System.out.println("R$ " + totalDivida + "foram usado para quitar o cheque especial (com taxa).");

            }else{
                double abatido =valor / 1.2;
                chequeEspecialUsado -= abatido;
                if(chequeEspecialUsado <0) chequeEspecialUsado = 0;
                System.out.println("R$ " + valor + "foram usado para abater parte do cheque especial. ");

                return;
            }
    }

        saldo += valor;
        System.out.println("Deposito realizado. Novo Saldo: " + saldo);

    }

    public void sacar(double valor){
        if (valor < saldo){
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            double totalDivida = saldo + (chequeEspecial - chequeEspecialUsado);
            if ( valor <= totalDivida){
                double valorUsadoCheque = valor - saldo;
                saldo = 0;
                chequeEspecialUsado += valorUsadoCheque;
                System.out.println("Saque realizado com cheque especial R$: " + valorUsadoCheque);

            }else {
                System.out.println("Saldo insuficiente e limite do cheque especial excedido.");
            }
        }
    }

    public void pagarBoleto(double valor){
        System.out.println("Tentando pagar boleto no valor de R$: " + valor);
        sacar(valor);
    }

    public static void main(String[] args) {
        // codigo que o  usuario vai usar 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do deposito inicial: ");

        double depositoInical = scanner.nextDouble();

        Banco conta = new Banco(depositoInical);

        int opcao;
        do{
            System.out.println("---Menu---");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Consultar cheque especial.");
            System.out.println("3. Sacar.");
            System.out.println("4. Pagar Boleto.");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2: 
                    conta.consultarCheque();
                    break;
                case 3:
                    System.out.println("Valor do saque: ");
                    conta.sacar(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Valor do deposito: ");
                    conta.depositar(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Valor do boleto R$: ");
                    conta.pagarBoleto(scanner.nextDouble());
                    break;    
                case 0:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }

        }while (opcao != 0);

        scanner.close();
    }
}
