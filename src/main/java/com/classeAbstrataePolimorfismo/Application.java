package com.classeAbstrataePolimorfismo;

public class Application {
  public static void main(String[] args){
    Laptop laptop = new Laptop("Samsumg", 100, 14);
    DeskTop Desktop = new DeskTop("Dell", 500);
    ComputerDevice genericDevice = new Laptop("Apple", 256.0, 13.3);

      if (genericDevice instanceof Laptop) {
        Laptop specificLaptop = (Laptop) genericDevice; // downcasting seguro
      }

  }

  public static void plugDevice(Chargeable chargeable){
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }
  public static void checkDevice(ComputerDevice device) {
    System.out.println("Verificando dispositivo de marca " + device.getBrand());
    device.bootUp();
  }

}
