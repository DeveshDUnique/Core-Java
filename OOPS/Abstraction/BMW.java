package OOPS.Abstraction;

class BMW extends AbstractCar {
   BMW() {
   }

   @Override
   public void drive() {
      System.out.println("Driving bmw");
   }

   @Override
   public void fly() {
      System.out.println("flying....");
   }
}