package com.colecoes;

import java.util.HashSet;
import java.util.Set;

public class Sets {

//  Uso Comum: Set é usado quando você precisa garantir que não existam duplicatas entre os elementos.


  public static void main(String[] args){
    //  Um Set imutável] pode ser criado com a seguinte sintaxe:
    Set<String> estudantes = Set.of("João","Maria","Pedro","Rosa");

    //Já os mutáveis podem ser criados instanciando subclasses, como TreeSet e HashSet
    HashSet<String> estudantes2 = new HashSet<>();

    //A operação de adição de elementos no Set retorna um boolean.
    // Como o Set não admite elementos repetidos, na segunda linha ele retorna false;

    boolean adicionouJoao = estudantes2.add("João");
    boolean adicionouJoaoDeNovo = estudantes2.add("João");
    boolean adicionouMaria = estudantes2.add("Maria");

    System.out.println(String.format("adicionouJoao: %b",adicionouJoao));
    System.out.println(String.format("adicionouJoaoDeNovo: %b",adicionouJoaoDeNovo));
    System.out.println(String.format("adicionouMaria: %b",adicionouMaria));

  }


}
