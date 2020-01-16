import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.Scanner;

public class SmsSender {
    static Scanner sc=new Scanner(System.in);
    private static final String ACCOUNT_SID =
            PrivateInfo.ACCOUNT_SID;
    private static final String AUTH_TOKEN =
            PrivateInfo.AUTH_TOKEN;

    public static void main() {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        System.out.println("What should the message say ?");
        Message message = Message
                .creator(new PhoneNumber(PrivateInfo.to), // to
                        new PhoneNumber(PrivateInfo.from), // from
                        sc.nextLine())
                .create();

        System.out.println(message.getSid());
    }
}