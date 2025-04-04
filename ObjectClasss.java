public class ObjectClasss {

    /*Sunbeam Infotech www.sunbeaminfo.com
Object class
• It is a non final and concrete class declared in java.lang package.
• In java all the classes( not interfaces )are directly or indirectly extended from java.lang.Object
class.
• In other words, java.lang.Object class is ultimate base class/super
• cosmic base class/root of Java class hierarchy
• Object class do not extend any class or implement any interface.
• It doesn’t contain nested type as well as field.
• It contains default constructor.
• Object o = new Object(“Hello”); // NOT OK
• Object o = new Object( ); // OK
• Object class contains 11 methods.
• In the given code, java.lang.object is direct super class of class Person.
• For class Employee, class Person is direct super class and class object is indirect super class. */

public static void main(String[] args) {
    
    Object o = new Object();
    System.out.println(o);
    System.out.println(o.hashCode());

}
}
