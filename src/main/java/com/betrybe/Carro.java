package com.betrybe;

public class Carro {

   static int contador = 0;
  private String marca;
  private String modelo;
  private int ano;

  public Carro(String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    contador ++;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getMarca(){
    return marca;
  }

  public void setMarca(String marca){
    this.modelo = marca;
  }

  public static int getContador() {
    return contador;
  }

  public static void setContador(int contador) {
    Carro.contador = contador;
  }

  public void exibirInformacoes(){
    System.out.println("Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano);
  }

   static int quantidadeDeCarros(){
     System.out.println(contador);
      return contador;
  }
}
