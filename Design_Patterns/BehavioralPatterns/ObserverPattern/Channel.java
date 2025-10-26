package Design_Patterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    List<Subscriber> subs = new ArrayList<>();
    private String channelName;
    private String title;

    
    public Channel(String name){
        this.channelName =name;
    }

    public String getTitle(){
        return title;
    }

    public String getName() {
        return channelName;
    }

    public void subscribe(Subscriber su){  // when channel is subscribed by subscriber we add them to channel list
        subs.add(su);
    }

    public void unSubscribe(Subscriber ss){ // when subscriber unsubscribes the channer we remove from the channel list
        subs.remove(ss);
    }

    // to notify the subscribers when video is updated

    public void notifySubscribers(){
        for (Subscriber subscriber : subs) {

            subscriber.update();
            
        }
    }

    // when we upload any video we should notify all

    public void upload(String title){
        this.title = title;
        notifySubscribers();

    }
    
}
