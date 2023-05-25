package Programa;

import java.util.Scanner;

import static Programa.AgenciaBancaria.encontrarConta;
import static Programa.AgenciaBancaria.operacoes;

public class Sacar {

    private static Scanner imput = new Scanner(System.in);

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

}
