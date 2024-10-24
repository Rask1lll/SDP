package Observer;
import java.util.ArrayList;
import java.util.List;

class NewsPublisher implements Subject {
    private String latestNews;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void updateNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}
