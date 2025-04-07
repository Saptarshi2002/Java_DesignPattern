
class SMSNotification implements Notification {
    private static SMSNotification instance = new SMSNotification();

    private SMSNotification() {}

    public static SMSNotification getInstance() {
        return instance;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
