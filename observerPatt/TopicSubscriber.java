package observerPatt;

public class TopicSubscriber implements Observer{
    private String name;
    private Subject topic; // 어떤 Topic을 참조할 것인지

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ": No new message");
        } else {
            System.out.println(name + " got message >> " + msg);
        }
    }
}
