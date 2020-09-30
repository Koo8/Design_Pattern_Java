package Observer_Pattern1;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternMain {
    public static void main(String[] args) {
        // create Observer_Pattern1.InterfaceTopic - Observer_Pattern1.MyOwnTopic
        MyOwnTopic topic = new MyOwnTopic();


        // create observers
        ISubscriber lucy = new MySubscriber("LUCY", topic, 3);
        ISubscriber josh = new MySubscriber("Josh", topic, 5);
        ISubscriber megan = new MySubscriber("Megan", topic, 2);
        // add to list
        List<ISubscriber> list = new ArrayList<>();
        list.add(lucy);
        list.add(josh);
        list.add(megan);
        // register subscribers
        topic.register(lucy);
        topic.register(josh);
        topic.register(megan);

        topic.setNewMessage("First message go");
        topic.postNewMessageToObservers();


        topic.setNewMessage("Second Message go");
        topic.postNewMessageToObservers();
        topic.setNewMessage("Third Message go");
        topic.postNewMessageToObservers();
        topic.setNewMessage("Forth Message go");
        topic.postNewMessageToObservers();
        topic.setNewMessage("Fifth Message go");
        topic.postNewMessageToObservers();
        topic.setNewMessage("Sixth Message go");
        topic.postNewMessageToObservers();
    }
}
