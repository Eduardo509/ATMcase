package Programa;

import java.util.Scanner;

import static Programa.AgenciaBancaria.listar;
import static Programa.Depositar.depositar;
import static Programa.Sacar.sacar;
import static Programa.Trasferir.transferir;
import static Programa.criarConta.criarconta;

public class Operacoes {
    static Scanner imput = new Scanner(System.in);

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
}
