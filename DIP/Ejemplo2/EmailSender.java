package DIP.Ejemplo2;

public class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}