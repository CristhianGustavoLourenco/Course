/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author crist
 */
public class Program16 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Cristhian");
        list.add("Gustavo");
        list.add("Lourenco");
        list.add("Luiz");

        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        list.remove(1);

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        System.out.println("Index fo Bob: " + list.indexOf("Bob"));

        System.out.println("Index fo Marco: " + list.indexOf("Marco"));

        System.out.println("----------------------------------");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for(String x : result){
            System.out.println(x);
        }
        
         System.out.println("----------------------------------");
         
         String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
         
         System.out.println(name);

    }
}
