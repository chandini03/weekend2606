
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class Intest {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int k=input.nextInt();
        int sm=0;
        
        while(t>0)
        {
            int n=input.nextInt();
            sm=n%k==0?sm+1:sm;
            t--;
        }
        System.out.println(sm);
      
    }
}
