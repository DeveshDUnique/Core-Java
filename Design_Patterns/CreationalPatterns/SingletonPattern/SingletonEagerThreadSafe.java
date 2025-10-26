package Design_Patterns.CreationalPatterns.SingletonPattern;
// eager threadsafe
public class SingletonEagerThreadSafe {
      /*The JVM loads classes only once per ClassLoader.
        Static fields are initialized in a thread-safe manner by the JVM before any thread accesses them. */

    private static SingletonEagerThreadSafe s2 = new SingletonEagerThreadSafe();

    private SingletonEagerThreadSafe(){

    }

    public static SingletonEagerThreadSafe getInstance(){
        return s2;
    }

    
    public static void main(String[] args) {
      
        SingletonEagerThreadSafe ss = SingletonEagerThreadSafe.getInstance();
        System.out.println(ss);

        SingletonEagerThreadSafe st = SingletonEagerThreadSafe.getInstance();
        System.out.println(st);
        
    }
    
}
