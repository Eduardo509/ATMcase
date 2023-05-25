package Autenticate;
import Programa.Conta;
import java.util.Scanner;
import static Programa.AgenciaBancaria.encontrarConta;

public class autentificar {
    static Scanner imput = new Scanner(System.in);
    public static void autenticar(){
        System.out.println("Digite o numero da conta");
        int numeroConta = imput.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Digite o CPF ");
            String cpf;
            cpf = imput.nextLine();
            conta.autentificar(cpf);
        }
    }
}
