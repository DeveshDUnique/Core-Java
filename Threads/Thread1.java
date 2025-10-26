package Threads;



class MyThread extends Thread{
        @Override
        public void run() {
            for(int i =1; i<=10; i++){
                Thread tt = Thread.currentThread();
                System.out.println("Name: "+tt.getName()+" : "+" Id: "+tt.getId()+" : "+ "state:"+tt.getState()+" :"+i+ " extends thread class = "+tt);
                Thread1.delay(1000);
            }
        }
    }

class MyRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=1; i<=10; i++){
                Thread mt = Thread.currentThread();
                System.out.println("Name: "+mt.getName()+" : "+" Id: "+mt.getId()+" : "+ "state:"+mt.getState()+" :"+i+ " implements Runnable interface = "+mt);
                Thread1.delay(1000);
            }
        }
    }  
    

    public class Thread1 {

        public static void delay(int miliSec){
            try{
                Thread.sleep(miliSec);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        //main thread loop for 10 sec
        // for(int i=1;i<=10;i++){
        //     Thread th = Thread.currentThread();
        //     System.out.println("Name: "+th.getName() + " : "+"Id: "+th.getId()+" : "+i+" mymain");
        //     delay(1000);
        // }

        //extends class Thread
        MyThread mt = new MyThread();
        mt.start();

        //implements interface Runnable

        MyRunnable mr = new MyRunnable();
        Thread mrr = new Thread(mr);
        mrr.start();
    }
    }


