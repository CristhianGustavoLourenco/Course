/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Account;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao01;
        String nome;
        int numeroConta;
        double valor;

        System.out.println("PAGINA DE CADASTRAMENTO DE CLIENTE");
        System.out.println();
        System.out.print("NUMERO DA CONTA: ");
        numeroConta = scan.nextInt();
        scan.nextLine();
        System.out.println();
        System.out.print("NOME: ");
        nome = scan.nextLine();
        System.out.println();
        Account contaBancaria = new Account(numeroConta, nome);

        String VerificacaoSituacao;

        do {
            System.out.print("\nEXISTE UM DEPOSITO INICIAL(Y/N): ");
            VerificacaoSituacao = scan.nextLine().toUpperCase();
            if ("Y".equals(VerificacaoSituacao)) {
                System.out.print("\nVALOR DO DEPOSITO INICIAL:");
                valor = scan.nextDouble();
                contaBancaria.setSaldoContaBancaria(valor);
                System.out.println(contaBancaria.toString());
            } else if ("N".equals(VerificacaoSituacao)) {
                contaBancaria.setSaldoContaBancaria(0);
                System.out.println(contaBancaria.toString());
            } else {
                System.out.println("Opcao Invalida");
            }
        } while (!"Y".equals(VerificacaoSituacao) && !"N".equals(VerificacaoSituacao));

        do {
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("BEM VINDO AO BANCO DO PARAISO FISCAL DO BRASIL");
            System.out.println("--------------------------------------------------");
            System.out.println("DESEJA EFETUAR QUAL OPÇÃO:");
            System.out.println("1 - ACESSAR A CONTA BANCARIA");
            System.out.println("4 - SAIR DO PROGRAMA");
            System.out.println("--------------------------------------------------");
            System.out.print("OPCAO: ");
            opcao01 = scan.nextInt();
            System.out.println("--------------------------------------------------");
            if (opcao01 == 1) {
                System.out.println("--------------------------------------------------");
                System.out.println("DESEJA EFETUAR QUAL OPÇÃO:");
                System.out.println("--------------------------------------------------");
                System.out.println("1 - INFORMACOES DA CONTA BANCARIA");
                System.out.println("2 - DEPOSITO");
                System.out.println("3 - SAQUE");
                System.out.println("--------------------------------------------------");
                System.out.print("OPCAO: ");
                opcao01 = scan.nextInt();
                System.out.println("--------------------------------------------------");

                switch (opcao01) {
                    case 1:
                        System.out.println("--------------------------------------------------");
                        System.out.println("           INFORMAÇÕES DA CONTABANCARIA           ");
                        System.out.println("--------------------------------------------------");
                        System.out.println(contaBancaria.toString());
                        System.out.println("--------------------------------------------------");
                        break;

                    case 2:
                        System.out.println("--------------------------------------------------");
                        System.out.println("OPERAÇÃO - DEPOSITO");
                        System.out.println("--------------------------------------------------");
                        System.out.print("DIGITE O VALOR QUE DESEJA DEPOSITAR: ");
                        valor = scan.nextDouble();
                        contaBancaria.alterarSaldoConta(opcao01, valor);
                        System.out.println("--------------------------------------------------");
                        break;

                    case 3:
                        System.out.println("--------------------------------------------------");
                        System.out.println("OPERAÇÃO - SAQUE");
                        System.out.println("--------------------------------------------------");
                        System.out.print("DIGITE O VALOR QUE DESEJA SACAR: ");
                        valor = scan.nextDouble();
                        contaBancaria.alterarSaldoConta(opcao01, valor);
                        System.out.println("--------------------------------------------------");
                        break;

                    default:
                        System.out.println("Opcao Invalida");
                        break;
                }

            } else {
                System.out.println("Opcao Invalida\n");
            }

        } while (opcao01 != 4);

        scan.close();
    }
}
