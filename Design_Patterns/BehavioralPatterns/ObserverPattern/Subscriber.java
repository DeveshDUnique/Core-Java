package Design_Patterns.BehavioralPatterns.ObserverPattern;

public class Subscriber {

    private String name;
    private Channel channel;

    public Subscriber(String name){
       
        this.name = name;
    }

    public void update(){
        System.out.println("Dear Subscriber "+ name +" New video " + channel.getTitle() + " uploaded to your subscribed channel "+ channel.getName());
    }

    //subscriber should know which channel should be updated

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
    
}
