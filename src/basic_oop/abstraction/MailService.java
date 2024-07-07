package basic_oop.abstraction;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        // Main Mail
        disconnect();
    }

    private void connect() {
        System.out.println("Connected.");
    }

    private void disconnect() {
        System.out.println("Disconnected.");
    }

    private void authenticate(){
        System.out.println("Authenticate.");
    }
}
