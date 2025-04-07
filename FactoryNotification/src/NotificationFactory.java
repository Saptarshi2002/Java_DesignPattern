
class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return SMSNotification.getInstance();
            case "email":
                return EmailNotification.getInstance();
            case "buzzer":
                return BuzzerNotification.getInstance();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
