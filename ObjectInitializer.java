public class ObjectInitializer {
    /*Java have provided 3 ways to initialize the object
            1. Field initializer
            2. Object initializer
            3. Constructor */


            private int num = 100; // Field initializer

            {
                num = 200; //object initializer
                System.out.println("Inside object initializer = " + num);
            }

            public ObjectInitializer() // constructor
            {
                num =300;
                System.out.println("Inside constructor initializng the object " + num);
            }
    
        public static void main(String[] args) {
            ObjectInitializer ob = new ObjectInitializer();
            
        }
                
}
