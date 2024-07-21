package com.heranca;

public class Barbarian extends PlayableCharacter {

  @Override
  public void move(){
    System.out.println("O barbaro pega impulso");
    super.move();
  }

}
