package com.betrybe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Carro carro1 = new Carro("hyundai", "HB20", 2023);
    Carro carro2 = new Carro("Ferrari", "Enzo", 1987);
    Carro carro3 = new Carro("Fiat", "Uno", 2003);


    carro1.exibirInformacoes();
    carro2.exibirInformacoes();
    carro3.exibirInformacoes();
    Carro.quantidadeDeCarros();
  }
}