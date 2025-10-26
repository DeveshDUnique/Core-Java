package Design_Patterns.BehavioralPatterns.ObserverPattern;

public class Main {

    public static void main(String[] args) {
    Channel dev = new Channel("Dev");

    Subscriber s1 = new Subscriber("shiv");
    Subscriber s2 = new Subscriber("mon");
    Subscriber s3 = new Subscriber("lalu");
    Subscriber s4 = new Subscriber("babdi");

    dev.subscribe(s1);
    dev.subscribe(s2);
    dev.subscribe(s3);
    dev.subscribe(s4);

    s1.subscribeChannel(dev);
    s2.subscribeChannel(dev);
    s3.subscribeChannel(dev);
    s4.subscribeChannel(dev);

    dev.upload("pubg");

    }
    
    
}
