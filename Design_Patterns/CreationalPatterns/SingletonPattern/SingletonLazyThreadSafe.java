package Design_Patterns.CreationalPatterns.SingletonPattern;
// this is lazy thread safe
public class SingletonLazyThreadSafe {

     // Volatile ensures changes are visible across threads
    private static volatile SingletonLazyThreadSafe s1 = null;

    private SingletonLazyThreadSafe(){

    }

    public static SingletonLazyThreadSafe getInstance(){
        if (s1 == null) {
            synchronized(SingletonLazyThreadSafe.class){
                if (s1 == null)  // checking two times so as to ensure that no two threads are initializing the instance at same time.
                {
                    s1 = new SingletonLazyThreadSafe();
                    
                }
                else{
                    System.out.println("Don't try to be smart with reflection");
                }
            }
        }
        return s1;
    }


    public static void main(String[] args) {

        SingletonLazyThreadSafe s1 = SingletonLazyThreadSafe.getInstance();
        System.out.println("First singleton object = "+ s1);
        
        SingletonLazyThreadSafe s2 = SingletonLazyThreadSafe.getInstance();
        System.out.println("Second singleon object = "+s2);

    }
    
}
