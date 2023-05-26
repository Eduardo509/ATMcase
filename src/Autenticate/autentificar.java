package Autenticate;
import Programa.Conta;
import java.util.Scanner;

import static Autenticate.test.cadastro;
import static Programa.AgenciaBancaria.encontrarConta;
import static Programa.Operacoes.operacoes;

public class autentificar {
    static Scanner imput = new Scanner(System.in);
    public static void autenticar(){
        System.out.println("Digite o numero da conta");
        int numeroConta = imput.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Digite a senha ");
            int senha = imput.nextInt();
            if (senha==conta.getSenha()){
                System.out.println("Autenticado !!");
                operacoes();
            }else{
                System.out.println("senha incorreta, tente novamente");
            } cadastro();

        }else{
            System.out.println("Conta não localizada");
            cadastro();
        }
    }

}
