import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Available opitions : \n " +
                "1)Place a call \n" +
                "2)Send an SMS \n" +
                "3)Schedule an SMS or call \n" +
                "4)*FLOOD CALLS*");

        switch(sc.nextByte())
        {
            case 1: PlaceACall.main();
            break;
            case 2: SmsSender.main();
            break;
            case 3:OnTime.main();
            break;
            case 4:CallFlooder.main();
            break;
            default:System.out.println("Wrong Input");

        }

    }

}
