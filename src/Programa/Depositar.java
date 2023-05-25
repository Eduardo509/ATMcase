package Programa;

import java.util.Scanner;

import static Programa.AgenciaBancaria.encontrarConta;
import static Programa.AgenciaBancaria.operacoes;

public class Depositar {
    static Scanner imput = new Scanner(System.in);

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
}
