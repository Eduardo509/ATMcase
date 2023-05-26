package Programa;

import java.util.Scanner;

import static Autenticate.test.cadastro;
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
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Trasferir");
        System.out.println("4 - Listar");
        System.out.println("5 - Sair");
        System.out.println("6 - voltar");

        int operacao = imput.nextInt();

        switch (operacao){
            case 1:
                depositar();
                break;
            case 2:
                sacar();
                break;
            case 3:
                transferir();
                break;
            case 4:
                listar();
                break;
            case 5:
                System.exit(0);
            case 6:
                cadastro();
            default:
                operacoes();
                break;
        }

    }
}
