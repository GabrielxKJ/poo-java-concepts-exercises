package com.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(6);
    numeros.add(2);
    numeros.add(3);
    numeros.add(2);
    System.out.println(numeros);

    List<String> estudantes = new ArrayList<>(Arrays.asList("Pedro", "Jorge", "Andrea", "Felipe"));
//    List<String> estudantes = Arrays.asList(new String[]{"João","Maria","Pedro","Rosa"});
    String estudandoDoIndice2 = estudantes.get(2);

//    Outra forma ainda mais simples de se criar listas, com a ressalva de que são imutáveis,
//    é utilizando a sintaxe que estreou no Java 9:
    List <String> estudantes2 = List.of("Gabreil", "juji", "poop", "mara");
    System.out.println(estudantes);
    System.out.println(estudantes2);

//    O Arrays.asList retorna uma lista de tamanho fixo, cujos valores são mutáveis.
    estudantes.set(0, "Gab");
    System.out.println(estudantes);
    estudantes.add("Pericles");
    estudantes.remove("Felipe");
    System.out.println(estudantes);
    System.out.println(estudantes.size());
    System.out.println(estudantes.contains("Gab"));

    List<String> nomesFiltrados = estudantes.stream().filter(estudante -> estudante.startsWith("P"))
    .toList();

    System.out.println(nomesFiltrados);


  }


}
