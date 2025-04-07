
class EmailNotification implements Notification {
    private static EmailNotification instance = new EmailNotification();

    private EmailNotification() {}

    public static EmailNotification getInstance() {
        return instance;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
