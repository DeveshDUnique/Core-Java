package OOPS.Abstraction;
public class AnnoymousInnerClass {

        public String outerClassName = "OuterClass Member";
        public static String staticOuterMember = "Static Outer Member";
    
        // Example in a non-static context (within an instance method)
        public void performAction(String message) {
            final String localMessage = message; // Effectively final local variable
    
            // Anonymous inner class implementing an interface
            Runnable myRunnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous Runnable - Message: " + localMessage);
                    System.out.println("Accessing outer class member (non-static): " + outerClassName);
                    System.out.println("Accessing outer class member (static): " + staticOuterMember);
                }
            };
    
            // Create and start a new thread using the anonymous Runnable object
            Thread thread = new Thread(myRunnable);
            thread.start();
        }
    
        // Example in a static context (within a static method)
        public static void staticOperation(int count) {
            final int localCount = count; // Effectively final local variable
    
            // Anonymous inner class inheriting from a class
            AbstractOperation operation = new AbstractOperation() {
                @Override
                public void execute() {
                    System.out.println("Anonymous AbstractOperation - Count: " + localCount);
                    System.out.println("Accessing outer class member (static): " + staticOuterMember);
                    // Cannot access non-static member 'outerClassName' from a static context
                }
            };
    
            // Execute the operation using the anonymous AbstractOperation object
            operation.execute();
        }
    
        public static void main(String[] args) {
            AnnoymousInnerClass outer = new AnnoymousInnerClass();
            outer.performAction("Hello from performAction!");
    
            System.out.println("---");
    
            staticOperation(5);
        }
    }
    

