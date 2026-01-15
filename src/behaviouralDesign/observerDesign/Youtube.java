package behaviouralDesign.observerDesign;

public class Youtube {
    public static void main(String[] args) {
        Channel tSeries = new Channel();

        Subscriber s1 = new Subscriber("Vivek");
        Subscriber s2 = new Subscriber("Raju");
        Subscriber s3 = new Subscriber("Ajay");
        Subscriber s4 = new Subscriber("Mudit");
        Subscriber s5 = new Subscriber("Mohit");

        tSeries.subscribe(s1);
        tSeries.subscribe(s2);
        tSeries.subscribe(s3);
        tSeries.subscribe(s4);
        tSeries.subscribe(s5);

        s1.subscribeChannel(tSeries);
        s2.subscribeChannel(tSeries);
        s3.subscribeChannel(tSeries);
        s4.subscribeChannel(tSeries);
        s5.subscribeChannel(tSeries);

        tSeries.upload("Gehra hua");
    }
}
