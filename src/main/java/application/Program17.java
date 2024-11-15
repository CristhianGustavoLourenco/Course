/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.DadosFuncionario01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas funcionarios deseja registrar? ");
        int quantidadeFuncionario = scan.nextInt();

        List<DadosFuncionario01> lista = new ArrayList<>();

        for (int i = 0; i < quantidadeFuncionario; i++) {

            System.out.println("\nFuncionario " + (i + 1) + "#:");
            System.out.print("\nID: ");
            Integer id = scan.nextInt();
            while(existeID(lista, id)){
                System.out.print("Esse Id já existe, tente novamente!");
                System.out.print("\nID: ");
                id = scan.nextInt();
            }
            System.out.print("\n Nome Completo: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("\nSalario: ");
            Double salario = scan.nextDouble();

            DadosFuncionario01 funcionario = new DadosFuncionario01(id, name, salario);

            lista.add(funcionario);
        }

        System.out.print("\nDigite o ID do Funcionário que terá o salário aumentado: ");
        int idsalary = scan.nextInt();
        
        DadosFuncionario01 funcionario = lista.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        
        //Integer pos = encontrarID(lista, idsalary);
        
        if (funcionario == null) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.print("Digite o percentual de aumento: ");
            double percentage = scan.nextDouble();
            funcionario.increaseSalary(percentage);
        }

        System.out.println("\nLista de Funcionários:");
        for (DadosFuncionario01 funcionarioListar : lista) {
            System.out.println("\n" + funcionarioListar);
        }

        scan.close();
     }

    public static Integer encontrarID(List<DadosFuncionario01> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean existeID(List<DadosFuncionario01> lista ,int id){
        DadosFuncionario01 funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
