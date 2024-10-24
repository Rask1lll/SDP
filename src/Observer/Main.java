package Observer;
public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        publisher.registerObserver(channel1);
        publisher.registerObserver(channel2);

        publisher.updateNews("Observer Pattern in Action!");
    }
}
