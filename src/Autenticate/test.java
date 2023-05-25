package Autenticate;

import java.util.Scanner;

import static Autenticate.autentificar.autenticar;
import static Programa.criarConta.criarconta;

public class test {

    static Scanner imput = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static void cadastro(){

        System.out.println("-------------");
        System.out.println("Seja bem vindo ^^");
        System.out.println("Já tem cadastro conosco?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int cadastro = imput.nextInt();

        switch(cadastro){
            case 1:
                autenticar();
                break;

            case 2:
                criarconta();
                break;

            default:
                System.out.println("opção invalida");
                break;
        }

    }
}
