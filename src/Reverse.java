
import java.util.Scanner;


public class Reverse {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int n=input.nextInt();
            while(n>0)
            {
                System.out.print(n%10);
                n/=10;
            }
               System.out.println();
               t--;
        }
        
    }
}
