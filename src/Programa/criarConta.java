package Programa;

import java.util.Scanner;

import static Programa.AgenciaBancaria.contasBancarias;
import static Programa.AgenciaBancaria.operacoes;


public class criarConta {
    static Scanner imput = new Scanner(System.in);
    public static void criarconta(){

        System.out.println("CPF");
        String cpf = imput.nextLine();


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
}
