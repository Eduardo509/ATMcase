package Programa;

import utilitarios.Utils;

public class Conta {

    private static int contadorDeContas = 1;
    private int numeroDeConta;
    private Pessoa pessoa;
    public double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroDeConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas +=1;
    }

    public static int getContadorDeContas() {
        return contadorDeContas;
    }

    public static void setContadorDeContas(int contadorDeContas) {
        Conta.contadorDeContas = contadorDeContas;
    }

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero De Conta=" + numeroDeConta +
                ", Nome=" + this.pessoa.getNome() +
                ", CPF=" + this.pessoa.getCPF() +
                ", E-Mail=" + this.pessoa.getEmail() +
                ", saldo=" + Utils.doubleToString(this.getSaldo()) +
                '}';
    }

    public void depositar(double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu valor foi depositado!");
        } else {
            System.out.println("Não é possivel depositar valor negativo");
        }
    }

    public void sacar(double valor){
        if (valor < saldo && valor >0){
            setSaldo(valor - getSaldo());
            System.out.println("Seque realizado com sucesso");
        }else {
            System.out.println("não foi possivel sacar");
        }
    }

    public void transferir (Conta contaParaDeposito, double valor){
        if (valor>0 && this.getSaldo()>= valor){
            setSaldo(getSaldo()-valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo()+valor;
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Não foi possivel realizar a transferencia");
        }
    }
}
