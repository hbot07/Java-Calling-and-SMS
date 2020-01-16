import java.util.Scanner;
//This program repeatedly places calls on my phone number.
public class CallFlooder {
    public static void main()
    {System.out.println("Welcome to call Flooder");
        Scanner sc=new Scanner(System.in);
    System.out.println("How many times to call?");
        int n = sc.nextInt();
        System.out.println("What should be the delay between two calls(in seconds)?");
        int delayInSeconds=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            n--;
            PlaceACall.main();
            try {
                Thread.sleep(1000*delayInSeconds); // 1000ms = 1s
            } catch(InterruptedException ex){

                System.exit(0);
            }
        }
    }
}
