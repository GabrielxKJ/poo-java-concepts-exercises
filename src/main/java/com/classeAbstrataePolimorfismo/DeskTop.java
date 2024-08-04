package com.classeAbstrataePolimorfismo;

public class DeskTop extends ComputerDevice implements Chargeable {
  public DeskTop(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }

  @Override
  public void bootUp(){
    System.out.println("Iniciando o computador DeskTop...");
  }

  public void charge() {
    System.out.println("Carregando Desktop");
  }

  public int getBatteryLevel(){
    return 85;
  }
}
