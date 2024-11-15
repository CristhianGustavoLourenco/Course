/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Veiculo {

    private String nomeVeiculo;
    private Integer idVeiculo;
    private String tipoVeiculo;
    private String marcaVeiculo;
    private String corVeiculo;
    private String temPagarIPVA;
    private Double valorVeiculo;
    private Double kilometragemVeiculo;

    // Lista para armazenar os objetos Veiculo
    private List<Veiculo> listaVeiculos;

    // Construtor da classe Veiculos
    public Veiculo() {
        this.listaVeiculos = new ArrayList<>();
    }

    public Veiculo(String nomeVeiculo, Integer idVeiculo,
            String tipoVeiculo, String marcaVeiculo, String corVeiculo,
            String temPagarIPVA, Double valorVeiculo,
            Double kilometragemVeiculo) {

        this.nomeVeiculo = nomeVeiculo;
        this.idVeiculo = idVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.corVeiculo = corVeiculo;
        this.temPagarIPVA = temPagarIPVA;
        this.valorVeiculo = valorVeiculo;
        this.kilometragemVeiculo = kilometragemVeiculo;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public void setTemPagarIPVA(String temPagarIPVA) {
        this.temPagarIPVA = temPagarIPVA;
    }

    public void setValorVeiculo(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public void setKilometragemVeiculo(Double kilometragemVeiculo) {
        this.kilometragemVeiculo = kilometragemVeiculo;
    }

    // Método para cadastrar novos veículos
    public void cadastrarVeiculo(int quantidadeRegistro) {
        Scanner scan = new Scanner(System.in);

        // Loop para cadastrar a quantidade de veículos especificada
        for (int i = 0; i < quantidadeRegistro; i++) {
            System.out.print("Veiculo #" + (i + 1) + ":");

            // Solicita os dados do usuário
            System.out.print("\nTipo de Veiculo (Carro |"
                    + " Moto | Caminhao): ");
            String tipoVeiculo = scan.nextLine();

            System.out.print("\nNome do Veiculo: ");
            String nomeVeiculo = scan.nextLine();

            System.out.print("\nMarca do Veiculo (Volkswagen |"
                    + " Chevrolet | Fiat | Ford | Honda): ");
            String marcaVeiculo = scan.nextLine();

            System.out.print("\nCor do Veiculo (Branco |"
                    + " Preto | Prata | Cinza | Vermelho |"
                    + " Azul | Bege | Verde): ");
            String corVeiculo = scan.nextLine();

            System.out.print("\nKilometragem do Veiculo: ");
            Double kilometragemVeiculo = scan.nextDouble();
            
            scan.nextLine();

            System.out.print("\nTem que pagar IPVA (Sim | Nao): ");
            String temPagarIPVA = scan.nextLine();

            System.out.print("\nValor do Veiculo: ");
            Double valorVeiculo = scan.nextDouble();
            
            scan.nextLine();

            // Atribui um ID único para cada veículo
            Integer idVeiculo = (i + 1);

            // Cria um novo objeto Veiculo com os dados fornecidos
            Veiculo veiculo = new Veiculo(nomeVeiculo, idVeiculo, tipoVeiculo,
                    marcaVeiculo, corVeiculo, temPagarIPVA,
                    valorVeiculo, kilometragemVeiculo);

            // Adiciona o veículo criado à lista
            listaVeiculos.add(veiculo);
        }
    }

    // Método para retornar a lista de veículos cadastrados
    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    @Override
    public String toString() {
        return "\nID: " + idVeiculo + "\nNome: " + nomeVeiculo
                + "\nTipo: " + tipoVeiculo
                + "\nMarca: " + marcaVeiculo + "\nCor: "
                + corVeiculo + "\nTem que Pagar IPVA: " + temPagarIPVA
                + "\nValor:" + valorVeiculo + "\nKilometragem: "
                + kilometragemVeiculo + '}';
    }

    public void AlterarCaracteristicaVeiculo(int IdEscolhidoVeiculo, int OpcaoCaracteristicaAlterarVeiculo) {
        Scanner scan = new Scanner(System.in);
        Veiculo ResultadoBusca = listaVeiculos.stream().filter(x -> x.getIdVeiculo() == IdEscolhidoVeiculo).findFirst().orElse(null);

        if (ResultadoBusca == null) {
            System.out.println("Veiculo nao encontrado! Alteracao nao foi concluida");
        } else {
            Integer posicaoIdListaVeiculos = listaVeiculos.indexOf(ResultadoBusca);

            if (posicaoIdListaVeiculos != -1) {

                switch (OpcaoCaracteristicaAlterarVeiculo) {

                    case 1:
                        System.out.print("Alteracao - Nome: ");
                        String nome = scan.nextLine();
                        listaVeiculos.get(posicaoIdListaVeiculos).setNomeVeiculo(nome);
                        break;

                    case 2:
                        System.out.print("Alteracao - Tipo (Carro |"
                                + " Moto | Caminhão): ");
                        String tipo = scan.nextLine();
                        listaVeiculos.get(posicaoIdListaVeiculos).setTipoVeiculo(tipo);
                        break;

                    case 3:
                        System.out.print("Alteracao - Marca (Volkswagen |"
                                + " Chevrolet | Fiat | Ford | Honda): ");
                        String marca = scan.nextLine();
                        listaVeiculos.get(posicaoIdListaVeiculos).setMarcaVeiculo(marca);
                        break;

                    case 4:
                        System.out.print("Alteracao - Cor (Branco |"
                                + " Preto | Prata | Cinza | Vermelho |"
                                + " Azul | Marrom/Bege | Verde): ");
                        String cor = scan.nextLine();
                        listaVeiculos.get(posicaoIdListaVeiculos).setCorVeiculo(cor);
                        break;

                    case 5:
                        System.out.print("Alteracao - Tem que pagar IPVA (Sim | Não): ");
                        String temIPVA = scan.nextLine();
                        listaVeiculos.get(posicaoIdListaVeiculos).setTemPagarIPVA(temIPVA);
                        break;

                    case 6:
                        System.out.print("Alteracao - Kilometragem: ");
                        Double kilometragem = scan.nextDouble();
                        listaVeiculos.get(posicaoIdListaVeiculos).setKilometragemVeiculo(kilometragem);
                        break;

                    case 7:
                        System.out.print("Alteracao - Valor: ");
                        Double valor = scan.nextDouble();
                        listaVeiculos.get(posicaoIdListaVeiculos).setValorVeiculo(valor);
                        break;

                }

                System.out.println("Alteracao concluida com sucesso!");
            } else {
                System.out.println("Valor nao encontrado na Lista! Alteracao nao foi concluida");
            }
        }

    }

}
