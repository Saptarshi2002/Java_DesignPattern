
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NotificationService notify = new NotificationService();
		notify.notifyService("sms", "Hello");
		notify.notifyService("email", "Hello");
		notify.notifyService("buzzer", "Hello");
	}

}
