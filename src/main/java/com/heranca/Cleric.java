package com.heranca;

public class Cleric extends PlayableCharacter{
  private String magic;

  public String getMagic(){
    return  magic;
  }

  public void setMagic(String magic){
    this.magic = magic;
  }

  /*A sobrecarga método (overload em inglês) se refere à capacidade de uma classe
  ter vários métodos com o mesmo nome, mas com diferentes listas de parâmetros.
  A lista de parâmetros pode variar em número, tipo ou ambos
  */
  public void heal() {
    System.out.println("O clérigo está curando com uma habilidade básica.");
  }

  public void heal(String potion) {
    System.out.println("O clérigo está curando com a poção " + potion + ".");
  }

  public void heal(String spell, int power) {
    System.out.println("O clérigo está usando o feitiço " + spell + " com um poder de " + power + ".");
  }
}
