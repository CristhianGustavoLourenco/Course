/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
this template
 */
package application;

import entities.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Veiculo> listaVeiculos = new ArrayList<>();
        Integer opcao = 0;

        while (opcao != 4) {

            System.out.println("\nOPCOES PARA SELECIONAR:");
            System.out.println("1 - Cadastrar Veiculo");
            System.out.println("2 - Modificar informacoes do veiculo");
            System.out.println("3 - Mostrar lista de veiculos");
            System.out.println("4 - Sair");
            System.out.print("OPCAO SELECIONADA: ");
            opcao = scan.nextInt();
            
            Veiculo veiculos = new Veiculo();
            
            switch (opcao) {
                               
                case 1:

                    System.out.print("Digite quantos veiculos deseja registrar: ");
                    int quantidadeRegistro = scan.nextInt();

                    veiculos.cadastrarVeiculo(quantidadeRegistro);

                    for (Veiculo veiculo : veiculos.getListaVeiculos()) {
                        listaVeiculos.add(veiculo);

                    }

                    break;

                case 2:
                    System.out.println("Lista de Veiculos Cadastrados:");
                    for (Veiculo veiculo : listaVeiculos) {
                        System.out.println("\n" + veiculo);
                    }
                    System.out.print("Selecione o ID do veiculo que deseja alterar: ");
                    Integer IdEscolhidoVeiculo = scan.nextInt();
                    
                    System.out.print("Selecione a caracteristica que deseja alterar (1 - Nome | 2- Tipo | 3 - Marca | 4 - Cor | 5 - Tem que pagar IPVA | 6 - Kilometragem | 7 - Valor): ");
                    Integer OpcaoCaracteristicaAlterarVeiculo = scan.nextInt();
                    
                    veiculos.AlterarCaracteristicaVeiculo(IdEscolhidoVeiculo, OpcaoCaracteristicaAlterarVeiculo);

                    break;

                case 3:

                    System.out.println("Lista de Veiculos Cadastrados:");
                    for (Veiculo veiculo : listaVeiculos) {
                        System.out.println("\n" + veiculo);
                    }

                    break;

            }

        }

    }
}
