package com.colecoes;

import java.util.HashMap;

public class Mapa {

  public static void main(String[] args) {
//    começaremos criando um mapa mutável. Por exemplo, um HashMap

    HashMap<String, String> estudantes = new HashMap<String, String>();
    estudantes.put("abcd1","Hawk");
    estudantes.put("efgh2","JOrge");
    estudantes.put("ijkl3", "Lucas");

    String valorAnterior = estudantes.put("abcd1", "Pedro");

    System.out.println("Valor anterior de abcd1: "+valorAnterior);
    System.out.println("Estudantes: "+estudantes);
    System.out.println(estudantes.get("efgh2"));

    estudantes.remove("ijkl3");
    estudantes.remove("efgh2");

    System.out.println(estudantes);
    System.out.println("TAMANHO: "+estudantes.size());
    System.out.println("VERIFICA SE MAP ESTA VAZIO: "+estudantes.isEmpty());
  }


}
