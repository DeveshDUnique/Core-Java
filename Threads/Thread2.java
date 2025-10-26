package Threads;

class FirstThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("FirstThread :"+i);
           Thread2.delay(1000);
        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("SecondThread :"+i);
           Thread2.delay(1000);
        }
     
    }

}

public class Thread2 {
    public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        	// main thread -- created by jvm -- non-daemon thread
		// for (int i = 1; i <= 10; i++) {
		// 	System.out.println("main : " + i);
		// 	delay(1000);
		// }	

        FirstThread ft = new FirstThread();
        // non-daemon thread
        ft.start();

        /*Daemon threads
            By default all threads are non-daemon threads (including main thread).
            We can make a thread as daemon by calling its setDaemon(true) method -- before starting the thread.
            Daemon threads are also called as background threads and they support/help the non-daemon threads.
            When all non-daemon threads are terminated, the Daemon threads get automatically terminated.
             */

        SecondThread st = new SecondThread();
        //Daemon thread
        st.setDaemon(true);
        st.start();

    }
    
}
