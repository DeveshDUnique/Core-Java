package OOPS.Abstraction;

abstract class AbstractCar {
   AbstractCar() {
   }

   public abstract void drive();

   public abstract void fly();

   public void playMusic() {
      System.out.println("Play music");
   }
}
