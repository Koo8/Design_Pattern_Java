package Observer_Pattern1;

public interface InterfaceTopic {
    // register and unregister observers
    public void register(ISubscriber obs);
    public void unregister(ISubscriber obs);

    public String getNewMessage();
    public void setNewMessage(String mes);

    // post update to observer
    public void postNewMessageToObservers();
}
