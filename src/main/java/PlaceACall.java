import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;

import java.net.URI;
import java.util.Scanner;

public class PlaceACall {

Scanner sc=new Scanner(System.in);
    private static final String ACCOUNT_SID =
            PrivateInfo.ACCOUNT_SID;
    private static final String AUTH_TOKEN =
            PrivateInfo.AUTH_TOKEN;

    public static void main() {
        try{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber(PrivateInfo.to),
                new com.twilio.type.PhoneNumber(PrivateInfo.from),
                URI.create("https://parththakur.000webhostapp.com/response.xml"))//this is twiml which is executed when call is accepted
                .create();

        System.out.println("Call successfully placed with ID: "+call.getSid());//If you wonder what the call would sound like - it would just drop in a
                                          //hello , play a song ,and say bye .
    }catch(Exception e){
            System.out.println("Did you add your information to PrivateInfo.java correctly ?");
        }

    }
}