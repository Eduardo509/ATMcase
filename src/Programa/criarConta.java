package Programa;

import java.util.Scanner;

import static Autenticate.test.cadastro;
import static Programa.AgenciaBancaria.contasBancarias;
import static Programa.AgenciaBancaria.encontrarConta;
import static Programa.Conta.definirSenha;


public class criarConta {
    static Scanner imput = new Scanner(System.in);
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public static void criarconta(){

        System.out.println("Nome");
        String nome = imput.next();

        System.out.println("CPF");
        String cpf = imput.nextLine();

        System.out.println("E-Mail");
        String email = imput.nextLine();

        System.out.println("digite uma senha numerica");
        int senha = imput.nextInt();
        System.out.println("Confirmar senha");
        int senhac = imput.nextInt();
        definirSenha(senha, senhac);

        Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);
        conta.setSenha(senha);

        contasBancarias.add(conta);
        System.out.println("Conta criada"+ conta);
        cadastro();
    }


}
