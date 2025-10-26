package OOPS.Inheritance;
/* Covariant Return Type (✅ Java supports)
Definition:
In method overriding, the overridden method in the subclass can return a more 
specific type (i.e., a subtype) of the return type declared in the superclass. */

class Animal {}
class Dog extends Animal {}

public class CovariantRetrunType {
    Animal getAnimal(){
        return new Animal();
    }
}

class Child extends CovariantRetrunType{
    @Override
    Dog getAnimal(){
        return new Dog();
    }
}

/*
What does this "Covariant Return Type" mean in this example?
It means that even though the getAnimal() method in CovariantReturnType promises to return 
an Animal (its declared return type), the overridden getAnimal() method in the Child class 
can legally return a Dog because Dog is a specific kind of Animal (a subtype). 
*/
