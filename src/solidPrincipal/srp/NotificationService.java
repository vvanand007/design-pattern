package solidPrincipal.srp;

public class NotificationService {
    public void sendOTP(String medium) {
        if(medium.equals("email")) {
            //logic related to email notification
        }
        if(medium.equals("sms")) {
            //logic related to sms notification
        }
    }
}
