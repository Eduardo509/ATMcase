package Programa;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner imput = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("Bom vindos a Agencia");
        System.out.println("Selecione uma opção");
        System.out.println("-------------------");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Trasferir");
        System.out.println("5 - Listar");
        System.out.println("6 - Sair");

        int operacao = imput.nextInt();

        switch (operacao){
            case 1:
                criarconta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.exit(0);
            default:
                operacoes();
                break;
        }

    }
    public static void criarconta(){

        System.out.println("CPF");
        String cpf = imput.nextLine();
        cpf = imput.nextLine();

        System.out.println("Nome");
        String nome = imput.nextLine();

        System.out.println("E-Mail");
        String email = imput.nextLine();

        Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        System.out.println("Conta criada"+ conta);
        operacoes();
    }

    private static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if (contasBancarias.size()>0){
            for (Conta c: contasBancarias){
                if (c.getNumeroDeConta() == numeroConta){
                    conta = c;
                }
            }
        }return conta;
    }

    public static void depositar(){
        System.out.println("Numero da conta: ");
        int numeroConta = imput.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("valor a depositar: ");
            double valorDeposito = imput.nextDouble();
            // Abaixo a variavel valor do metodo Depositar vai receber o valor da variavel ValorDeposito
            conta.depositar(valorDeposito);
            System.out.println("valor depositado com sucesso " + conta);
        } else {
            System.out.println("conta não encontrada");
        } operacoes();
    }
    public static void sacar(){
        System.out.println("numero da conta: ");
        int numeroConta = imput.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null){
            System.out.println("Valor a sacar");
            double valorSaque = imput.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("saque realizado com sucesso" + conta);
        } else{
            System.out.println("não foi possivel realizar o saque");
        } operacoes();
    }

    public static void transferir(){
        System.out.println("Digite o numero da sua conta");
        int numeroContaR = imput.nextInt();

        Conta contaR = encontrarConta(numeroContaR);
        if (contaR != null){
            System.out.println("Digite o numero da conta de destino");
            int numeroContaD = imput.nextInt();
            Conta contaD = encontrarConta(numeroContaD);

            if (contaD != null){
                System.out.println("digite o valor da tranferencia: ");
                double valorTransferencia = imput.nextDouble();
                contaR.transferir(contaD, valorTransferencia);
                System.out.println(contaR);

            }else {
                System.out.println("Conta não localizada");
            }
        }else{
            System.out.println("Conta não localizada");
        }
        operacoes();
    }

    public static void listar(){
        if (contasBancarias.size()>0){
            for (Conta conta: contasBancarias){
                System.out.println(conta);
            }
        }else {
            System.out.println("não há contas ");
        }
    }



}
