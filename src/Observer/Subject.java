package Observer;

interface Subject {
    void registerObserver(Subscriber observer);
    void removeObserver(Subscriber observer);
    void notifyObservers();
}
