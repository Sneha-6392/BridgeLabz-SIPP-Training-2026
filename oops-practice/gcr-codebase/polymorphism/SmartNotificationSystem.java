import java.util.Scanner;

class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + ": " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email Recipient: ");
        String emailName = sc.nextLine();

        System.out.print("Enter SMS Recipient: ");
        String smsName = sc.nextLine();

        System.out.print("Enter Push Notification Recipient: ");
        String pushName = sc.nextLine();

        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification(emailName, "Welcome to our service!");
        notifications[1] = new SMSNotification(smsName, "Your OTP is 123456");
        notifications[2] = new PushNotification(pushName, "You have a new update!");

        System.out.println("\nSent Notifications:");

        for (Notification n : notifications) {
            n.sendNotification();
        }

        sc.close();
    }
}