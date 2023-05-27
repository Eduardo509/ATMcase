package Programa;

import java.util.Scanner;

import static Programa.AgenciaBancaria.encontrarConta;
import static Programa.Operacoes.operacoes;

public class Trasferir {
    private static Scanner imput = new Scanner(System.in);



    public static void transferir(){
        System.out.println("Digite o numero da sua conta");
        int numerocontaR = imput.nextInt();
        Conta contaR = encontrarConta(numerocontaR);

        if (contaR != null){
            System.out.println("Digite o numero da conta de destino");
            int numeroContaD = imput.nextInt();
            Conta contaD = encontrarConta(numeroContaD);

            if (contaD != null){
                System.out.println("Digite o valor da transderencia");
                double valort = imput.nextDouble();

                contaR.transferir(contaD, valort);
                System.out.println(contaR);
            }else {
                System.out.println("Conta de destino não localizada");
            }

        }else {
            System.out.println("Conta não localizada");
        }operacoes();
    }
}
