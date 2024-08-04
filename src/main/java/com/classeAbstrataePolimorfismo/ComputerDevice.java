package com.classeAbstrataePolimorfismo;

public abstract class ComputerDevice {
  private final String brand;  // A marca não pode ser alterada
  private double storageCapacity;

  public ComputerDevice(String brand, double storageCapacity){
    this.brand = brand;
    this.storageCapacity = storageCapacity;
  }

  public String getBrand() {
    return brand;
  }

  public double getStorageCapacity() {
    return storageCapacity;
  }

  public final void  shutDown(){
    System.out.println("Desligando o dispositivo...");
  }

  public abstract void bootUp();
}
