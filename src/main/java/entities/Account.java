/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class Account {

    private int numeroConta;
    private String nomeTitular;
    private double saldoContaBancaria, valor;

    public Account(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Account(int numeroConta, String nomeTitular, double saldoContaBancaria) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoContaBancaria = saldoContaBancaria;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldoIncial() {
        return saldoContaBancaria;
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldoContaBancaria(double saldoContaBancaria) {
        this.saldoContaBancaria = saldoContaBancaria;
    }

    public void alterarSaldoConta(int opcao, double valor) {

        switch (opcao) {
            case 2 ->
                this.saldoContaBancaria += valor;
            case 3 ->
                this.saldoContaBancaria -= valor + 5.00;
            default ->
                System.out.println("Opção Inválido");
        }

    }

    public void alterarCadastroCliente(String nome) {
        this.nomeTitular = nome;
    }
    
    public static void acessarContaBancaria(){
        
    }
    
    public void cadastrarContaBancaria(int numeroContabancaria, String nomeTitular, double saldoContaBancaria){
        this.numeroConta = numeroContabancaria;
        System.out.println("NOME: ");
    }
    
    public String toString(){
        return "Numero da Conta: " 
                + numeroConta
                + " - Cliente: "
                + nomeTitular
                + " - Saldo: "
                + saldoContaBancaria;
                
    }

}
