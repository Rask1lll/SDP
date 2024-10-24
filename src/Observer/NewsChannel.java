package Observer;
class NewsChannel implements Subscriber {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(channelName + " received: " + news);
    }
}
