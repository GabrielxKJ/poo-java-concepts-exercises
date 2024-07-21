package com.heranca;

public class Main {
  public static void main(String[] args){
    Warrior warrior = new Warrior();
    warrior.setName("Miguel");
    warrior.setRaces("Anjo");
    warrior.setWeapon("Espada de fogo");

    Cleric cleric = new Cleric();
    cleric.setName("Lucas");
    cleric.setRaces("Doende");
    cleric.setMagic("Cura dívina");

    Mage mage = new Mage();
    mage.setName("Jack Spers");
    mage.setRaces("Ogro");
    mage.setSpell("Rajada de meteoro");

    heroCall(warrior);
    heroCall(cleric);
    heroCall((mage));

    cleric.heal();
    cleric.heal("Poção dívina");
    cleric.heal("feitiço de luz", 7);

  }

  public static void heroCall(PlayableCharacter hero){
    if(hero instanceof Warrior warrior){
      System.out.println(warrior.getName() + " é da raça " + hero.getRaces() + " e utiliza " + warrior.getWeapon());
    } else if(hero instanceof Mage mage) {
      System.out.println(mage.getName() + " é da raça " + mage.getRaces() + " e utiliza " + mage.getSpell());
    } else if(hero instanceof Cleric cleric) {
      System.out.println(cleric.getName() + " é da raça " + cleric.getRaces() + " e utiliza " + cleric.getMagic());
    }

  }
}
