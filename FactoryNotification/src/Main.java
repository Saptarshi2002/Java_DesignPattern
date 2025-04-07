
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NotificationService notify = new NotificationService();
	
		//SMS Notification
		notify.notifyService("sms", "Hello");
		
		//Email Notification
		notify.notifyService("email", "Hello");
		
		//Buzzer Notification
		notify.notifyService("buzzer", "Hello");
	}

}
