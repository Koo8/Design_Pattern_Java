package Observer_Pattern1;

public class MySubscriber implements ISubscriber {

    String subscriberName;
    int maxMessage;
    InterfaceTopic topic;
    int counter;

    // constructor - to connect this observer with this topic
    public MySubscriber(String subName, InterfaceTopic topic, int maxOfMessages) {
        subscriberName = subName;
        this.topic = topic;
        maxMessage = maxOfMessages;
        counter = 0;
    }

    @Override
    public void update() {
        String mes = topic.getNewMessage();
        counter++;
        if (counter <= maxMessage)
            System.out.println(subscriberName + " :" + mes);
        else topic.unregister(this);
    }
}
