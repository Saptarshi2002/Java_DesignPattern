
public class NotificationService {
//	void notifyService(String type,String message) {
//		Notification notify = NotificationFactory.createNotification(type);
//		notify.sendNotification(message);
//	}
	
	void notifyService(String type,String message) {
		Notification notify = NotificationFactory.createNotification(type);
		notify.sendNotification(message);
	}
}
