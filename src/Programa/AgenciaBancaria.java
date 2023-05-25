package Programa;

import java.util.ArrayList;
import java.util.Scanner;

import static Autenticate.test.cadastro;
import static Programa.Operacoes.operacoes;

public class AgenciaBancaria {
    static Scanner imput = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;
    static ArrayList<Pessoa> pessoas;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        cadastro();
    }


    public static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if (contasBancarias.size()>0){
            for (Conta c: contasBancarias){
                if (c.getNumeroDeConta() == numeroConta){
                    conta = c;
                }
            }
        }return conta;
    }

    static Pessoa encontrarPessoa(String cpf){
        Pessoa pessoa = null;
        if (pessoas.size()>0){
            for(Pessoa p : pessoas){
                if (p.getCPF().equals(cpf)){
                    pessoa = p;
                }
            }
        } return pessoa;
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
