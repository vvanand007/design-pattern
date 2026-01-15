package behaviouralDesign.observerDesign;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers(title);
    }

    public void notifySubscribers(String title) {
        for(Subscriber sub: subs) {
            sub.update(title);
        }
    }
}
