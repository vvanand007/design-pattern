package behaviouralDesign.observerDesign;

public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String title) {
        System.out.println("Hey " + name + ", video uploaded, " + title);
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
