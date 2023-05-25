package Programa;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

import static Programa.Depositar.depositar;
import static Programa.Sacar.sacar;
import static Programa.Trasferir.transferir;
import static Programa.criarConta.criarconta;

public class AgenciaBancaria {
    static Scanner imput = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("---------------------");
        System.out.println("Bem vindos a Agencia");
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


    static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if (contasBancarias.size()>0){
            for (Conta c: contasBancarias){
                if (c.getNumeroDeConta() == numeroConta){
                    conta = c;
                }
            }
        }return conta;
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
