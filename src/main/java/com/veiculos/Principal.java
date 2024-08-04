package com.veiculos;

public class Principal {
  public static void main(String[] args){
    Carro c1 = new Carro("BRL-0986", 2010);

    c1.abastecer("SHELL","JOAO",200);
    c1.abastecer("PETROBRAS","PEDRO",150);
    c1.abastecer("POSTO IPIRANGA","JORGE",300);

    c1.listAbastecimentos();
  }
}
