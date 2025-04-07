
class BuzzerNotification implements Notification {
    private static BuzzerNotification instance = new BuzzerNotification();

    private BuzzerNotification() {}

    public static BuzzerNotification getInstance() {
        return instance;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Buzzer sound played for message: " + message);
    }
}
