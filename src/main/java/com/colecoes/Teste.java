package com.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
  static List<String> listaDeNomes = new ArrayList<>(Arrays.asList("jow", "gab", "math", "morpheu", "caciano", "julianna"))
      .stream().map(String::toUpperCase).toList();
  public static void main(String[] args){

    List<Integer> listaDeInt = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    listaDeInt.add(10);

    List<Integer> numerosPares = listaDeInt.stream().filter( num -> num % 2 == 0).toList();

    int soma =  listaDeInt.stream().mapToInt(Integer::intValue).sum();

    System.out.println(soma);
    System.out.println(numerosPares);
    System.out.println(maiorNumeroDeCharQueOnumeroPassado(7));
  }

  public static List<String> maiorNumeroDeCharQueOnumeroPassado(int num){
   return listaDeNomes.stream().filter(e -> e.length() > num).toList();
  }
}
