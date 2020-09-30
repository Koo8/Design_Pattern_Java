package Observer_Pattern1;

import java.util.ArrayList;
import java.util.List;

public class MyOwnTopic implements InterfaceTopic {

    // each topic may have a few subscribers
    List<ISubscriber> subscribers;
    final Object MUTEX = new Object();
    String message;
    boolean changed;

    public MyOwnTopic() {
        // create a list to hold the subscribers
        subscribers = new ArrayList<>();
    }

    @Override
    public void register(ISubscriber obs) {
        if (obs != null) {
            synchronized (MUTEX) {
                if (!subscribers.contains(obs)) subscribers.add(obs);
            }
        }
    }

    @Override
    public void unregister(ISubscriber obs) {
        if(obs != null) {
            synchronized (MUTEX){
                subscribers.remove(obs);
            }
        }


    }

    @Override
    public String getNewMessage() {
        return message;
    }

    @Override
    public void setNewMessage(String myMessage) {
        message = myMessage;
    }

    @Override
    public void postNewMessageToObservers() {
        List<ISubscriber> subLocalList = null;

        synchronized (MUTEX) {  // this step is very important to avoid concurrentModificationException
            subLocalList = new ArrayList<>(subscribers);  // subscribers is kept on changing size, assign it to a new list that has no null elements.

        }
        for (ISubscriber subscriber : subLocalList) {
               subscriber.update();

        }
    }
}
