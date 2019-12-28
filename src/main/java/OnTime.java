import com.twilio.example.Example;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class OnTime {
static Scanner sc=new Scanner(System.in);
    public static void main() {
        System.out.println("Please enter at what time you want to send:");
        System.out.println("Hours");
        byte SHours=sc.nextByte();
        System.out.println("Minutes:");
        byte SMins=sc.nextByte();
        byte CHours=100,CMins=100;
        while(SHours!=CHours) {
            while(CMins!=SMins){
            //getting current date and time using Date class
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            String ct = df.format(dateobj);
            CHours = Byte.parseByte(ct.substring(9, 11));
            CMins = Byte.parseByte(ct.substring(12, 14));}
        }

        System.out.println("Enter 1 for placing a call and 2 for sending a message");
        switch(sc.nextByte()) {
            case 2 : SmsSender.main();
                break;
            case 1 :PlaceACall.main();
                break;
            default : System.out.println("Wrong Input");
        }



    }
}